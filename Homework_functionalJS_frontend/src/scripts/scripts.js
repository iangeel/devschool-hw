var container = document.querySelector('div');
var idInputVal = document.forms["myForm"]["id"].value;
var btn = document.querySelector("#btn");
var woeid;
var idInput = document.forms["myForm"]["id"];

btn.innerHTML = "Get Location";

idInput.addEventListener('keyup', function () {
    if(idInput.value == null || idInput.value == "") {
        btn.innerHTML = "Get Location";
    } else {
        btn.innerHTML = "Get Forecast";
    }
});

btn.addEventListener('click', function() {
    if(btn.innerHTML == "Get Location" || idInputVal == null || idInput.value == "") {
        btn.innerHTML = "Get Location";
        container.innerHTML = "";
        showLocation();
    } else {
        showWeather();
    }
});

const getLocation = async () => {
    
    try {
        const city = document.forms["myForm"]["cityName"].value;
        return await axios.get(`https://www.metaweather.com/api/location/search/?query=${city}`);
    } catch(err) {
        console.error(err);
    }
}

const getWeather = async () => {
    
    try {
        if(woeid != null) {
            return await axios.get(`https://www.metaweather.com/api/location/${woeid}/`);
        } 
    } catch(err) {
        console.error(err);
    }
}


const showLocation = async () => {
    const location = await getLocation();
    if(location) {
        if(location.data && location.data.length == 1) {
        console.log(location.data[0].title);
        container.innerHTML += location.data[0].title;
        woeid = location.data[0].woeid;
        container.innerHTML += " - City id: " + woeid;
        } else {
            alert("There are more than 1 city with this name / NETWORK PROBLEM");
        }
    }
}

const showWeather = async () => {
    const weather = await getWeather();

    if(weather.data) {
        console.log(weather.data);
        var state = weather.data.consolidated_weather[0].weather_state_name;
        var minT = weather.data.consolidated_weather[0].min_temp;
        var maxT = weather.data.consolidated_weather[0].max_temp;
        var sourcePic = weather.data.consolidated_weather[0].weather_state_abbr;
        addContent(state, minT, maxT,sourcePic); 
     }
}

function addContent(state, min, max, sourcePic) {
    var para = document.createElement("p");
    var stateContent = document.createTextNode("State: " + state);
    var img = document.createElement("img");
    img.src =`https://www.metaweather.com/static/img/weather/ico/${sourcePic}.ico`;
    para.appendChild(stateContent);
    para.appendChild(img);
    (container.lastChild).parentNode.insertBefore(para, (container.lastChild).nextSibling);

    var para2 = document.createElement("p");
    var minContent = document.createTextNode("Min temp: " + Math.trunc(min));
    para2.appendChild(minContent);
    (container.lastChild).parentNode.insertBefore(para2, (container.lastChild).nextSibling);

    var para3 = document.createElement("p");
    var maxContent = document.createTextNode("Max temp: " + Math.trunc(max));
    para3.appendChild(maxContent);
    (container.lastChild).parentNode.insertBefore(para3, (container.lastChild).nextSibling);   
}
