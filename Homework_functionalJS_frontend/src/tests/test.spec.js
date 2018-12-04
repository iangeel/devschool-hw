describe('Button txt value', function() {
    it("should be 'Get Forecast' when id input is not empty", function() {
       idInput.value = "868274";
       idInput.dispatchEvent(new Event('keyup'));
       expect(btn.textContent).to.be.equal("Get Forecast");
    });

    it("should be 'Get Location' when id input is empty", function() {
        idInput.value = "";
        idInput.dispatchEvent(new Event('keyup'));
        expect(btn.textContent).to.be.equal("Get Location");
     });
});


function fetchData(city) {
    try {
        return axios.get(`https://www.metaweather.com/api/location/search/?query=${city}`);
    } catch(err) {
        console.error(err);
    }
}

var obj = {};
obj.loc = async () => {
    
    try {
        const city = document.forms["myForm"]["cityName"].value;
        return await axios.get(`https://www.metaweather.com/api/location/search/?query=${city}`);
    } catch(err) {
        console.error(err);
    }
}

describe('Fetching data', function() {
    it('should be different than null after HTTP req', async() => {
        
        const myData = await sinon.stub(obj, 'loc').callsFake(fetchData('Bucharest'));
        expect(myData).to.be.not.null;
    });
});


