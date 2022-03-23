document.getElementById("form").addEventListener("submit", async function login(event){
    event.preventDefault();

let usernameInputElem = document.getElementById("username");
let passwordInputElem = document.getElementById("password");

let user = {
    username: usernameInputElem.value,
    password: passwordInputElem.value
}


// let response = await fetch("http://localhost:9000/login", {
//     method: "POST",
//     body: JSON.stringify(user)
// })

let responseBody = await response.json();

console.log(responseBody)


})