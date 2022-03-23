//variavle scope in js
//1. global scope - accessible anywhere
//2. local scope - accessible inside of something
//  a. function - inside of the function
//  b. lexical - variable outside of a function can be accessable inside of another function
//  c. block - inside of a set of curly brackets

var name1= 'Bob';
let name2 = 'Kevin'; //value can be reassigned in a function
const name3 = 'Azhya'; //value cannot be reassigned

function greetings(){
    var name2 = "mike"
    return ` Hello, ${name2}`;

}

//hoisting
function eatLunch(){
    name4 = "Greg";
    if (name4 === "Gregory"){
        var name4 = "Josh";
        return("Hi, Gregory")
    }else{
        return("Hi, Greg")
    }
}

console.log(greetings());
console.log(name2) //but not outside of the scope
console.log(eatLunch())

