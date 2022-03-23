console.log("Hello user :)")

// 
//1. declaration of variables
var num = 10; // number
var str = "10"; //string
var bool = true;
var nullData = null; //empty variable
var undefinedData = ""; //decalred but not initialized
var id = Symbol("id"); //unique key/identifier
var Person = {
    firstName: "Heather",
    lastName: "Cooper",
    toDos: ['eat', 'work', 'sleep'],
    sayHi: (fname) => {
        return `hello, ${fname}`;
    },
    //symbols allow us to create hidden properties that no other part of the code can access
    [id]:123
};

//2. display our variables using DOM manipulation
console.log(Person.sayHi())
console.log(Person.firstName)
console.log(Person[id]) //to access the hidden symbol

//DOM = document object model
//tree-like structure pf html 

//grab the element
var numEx = document.getElementById("num-ex");
var boolEx = document.querySelector('#bool-ex');
var symEx = document.getElementById('sym-ex');

//add things to the DOM
boolEx.innerHTML = bool;
numEx.innerHTML = num;
symEx.innerHTML = Person[id];

//truthy or falsey
//1, 2, hello, person = truthy
//false, 0, null, undefined = falsey
if(bool){
    boolEx.innerHTML = "I'm a true value"
}else{
    boolEx.innerHTML = "I'm a false value"
}

var pokemon = ["pikachu", "charmander", "snorlax", "mewtwo", "porygon"]
console.log(pokemon[2])

// var root = document.getElementById("#example");

// for (let index = 0; index<pokemon.length; index++){
//     //make a new element
//     var target = document.createElenebt('h1');


//     //give element to target's innerhtml
//     target.innerHTML = pokemon[index]

//     //add element to root
//     root.append(target);
// }
