const myAudio = document.getElementById('audioId');
const logo = document.getElementById('ing_logo');

logo.addEventListener("click", function(e) {
    if(myAudio.paused) {
        myAudio.play();
    } else {
        myAudio.pause();
        myAudio.currentTime = 0;
    }
});


const btnAddArticle = document.getElementById("btnInsertArticle");
var btnAddSection;

btnAddArticle.addEventListener("click", function(e) {
    var newArticle = document.createElement('article');
    var h2 = document.createElement("h2");
    var someContent = document.createTextNode("New article");

    h2.appendChild(someContent);
    newArticle.appendChild(h2);

    btnAddSection = document.createElement("button");
    var someBtnContent = document.createTextNode("Add new section");
    btnAddSection.appendChild(someBtnContent);
    
    btnAddSection.addEventListener("click", f);

    newArticle.appendChild(btnAddSection);

    var main = document.querySelector('main');
    var firstArticle = main.getElementsByTagName('article')[0];
    


    main.insertBefore(newArticle, firstArticle);
});

var f = function createSection(e) {
    var newSection = document.createElement("section");
    var h3 = document.createElement("h3");
    var h3Content = document.createTextNode("New section with 400 random characters");
    var para = document.createElement("p");
    para.classList.add("para");

    var sectionContent = createRandomText();
    var sectionContentNode = document.createTextNode(sectionContent);


    h3.appendChild(h3Content);
    newSection.appendChild(h3);
    para.appendChild(sectionContentNode);
    newSection.appendChild(para);

    const btn = e.target;
    
    const currentArticle = btn.parentNode;
    currentArticle.insertBefore(newSection, btn);
}

function createRandomText() {
    var text = "";
    var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  
    for (var i = 0; i < 400; i++)
      text += possible.charAt(Math.floor(Math.random() * possible.length));
  
    return text;
  }


  //get all my sections
  


var isSectionInVP = function (elem) {
    var bounding = elem.getBoundingClientRect();
    var sectionHeight = elem.clientHeight;
    return (
        
        (bounding.top + sectionHeight / 2) >=
         ( window.innerHeight / 2 -10 || document.documentElement.clientHeight / 2 - 10) &&

         (bounding.top + sectionHeight / 2) <=
         ( window.innerHeight / 2 +10  || document.documentElement.clientHeight / 2 +10)
       
    );
};



window.addEventListener("scroll", function(e) {
    var sections = document.querySelectorAll('section');
    sections.forEach(section => {
        if(isSectionInVP(section)) {
            console.log("ALEEEEEEEEEEEEEEEEEEEEEELUIAAAAA");
            section.classList.add("isCentered");
        } else { 
            section.classList.remove("isCentered");
        }
    });
    
});
