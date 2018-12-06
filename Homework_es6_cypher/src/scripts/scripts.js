var myLog = new Map();
var store = new Map();

class Cypher {
    constructor(key = 123) {
        this.key = key;
    }

    async encode(word) {
        var encodedWord = [];
        for(let letter of word) {
            encodedWord.push(letter.charCodeAt(0) * this.key);
        }
        encodedWord = encodedWord.join("-");
        
        store.set(encodedWord, word);
        myLog.set(getCurrentDate(), `"${word}" encoded as "${encodedWord}"`);

        await timeout(word.length * 100);
        return encodedWord;
    }

    async decode(encodedWord) {
        var encodedArr = encodedWord.split("-");
       
        let message = "";

        if(store.has(encodedWord)) {
            message = store.get(encodedWord);
        } else {
            for(let code of encodedArr) {
                var w = String.fromCharCode(code / this.key);
                message += w;
            }
        }
        
        myLog.set(getCurrentDate(), `"${encodedWord}" decoded as "${message}"`);

        await timeout(encodedWord.length * 100);
        return message;
    }

    readLog() {
        myLog.forEach(logMapElements);
    }
}


(async() => {
    const c = new Cypher(20);
    msg = await c.encode("DevSchool");
    console.log(msg);
    console.log(await c.decode(msg));
    c.readLog();
})();

function timeout(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

function logMapElements(value, key) {
    console.log(`${key}: ${value}`);
  }

function getCurrentDate() {
    var today = new Date();
    var dd = today.getDate();
    var MM = today.getMonth()+1; 
    var yyyy = today.getFullYear();
    var hh = today.getHours();
    var mm = today.getMinutes();
    var ss = today.getSeconds();

    if(dd<10) {
        dd = '0'+dd
    } 

    if(MM<10) {
        MM = '0'+MM
    } 

    if(mm<10) {
        mm = '0'+mm
    }

    if(ss<10) {
        ss = '0'+ss
    }

    today = dd + '/' + MM + '/' + yyyy + ", " + hh + ":" + mm +":" + ss;

    return today;
}