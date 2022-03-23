var num1 = 5;
var num2 = "65";

function add(n1, n2){
    return parseInt(n1) + parseInt(n2)
}
//parseInt converts strings to numbers

console.log(add(num1, num2));

//== is comparing without type
console.log(num2 == 65); //true
//=== checks for type
console.log(num2 === 65); //false

//anon function
//doesn't have a name but can be accessed by a variable
var multiply = function(n1, n2){
return n1 * n2
}
console.log(multiply(2, 3));

//arrow functions
var square = (n) =>{
    return n * n
}
console.log(square(9))

//callback functions
//functions that can be invoked by another function
function complexMath(n){ //this function is called a closure. A function that can have inner functions that can access the values/variables of the outer function
    var secretNum = n;

    function subtract(){
        return (secretNum - 18)
    }
    //this is the callback part of it
    return subtract();
}

console.log(complexMath(9))

//