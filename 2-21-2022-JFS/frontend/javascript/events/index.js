//event - something that happens in the browser (onClick, onSubmit, onMouseover, onChange)

//propagnation = in which order events are triggered

//selevt html elements
var parent1 = document.getElementById("parent-1");
var parent2 = document.getElementById("parent-2");
var child1 = document.getElementById("child-1");
var child2 = document.getElementById("child-2");

//manage a given event, we can use event listeners
//bubbling - events are triggered from child to parent
parent1.addEventListener('click', () =>{
    console.log('I am the Parent')
})

child1.addEventListener('click', () =>{
    console.log('I am the child')
})

//capturing - from parent to child
//mousetrap on a mouse eating cheese
parent2.addEventListener('click', () =>{
    console.log('I am the Parent')
})

child2.addEventListener('click', () =>{
    console.log('I am the child')
})


// function clickFunc(e){
//     e.preventDefault(); //to prevent from refreshing the page, specifically forms
//     e.stopPropagation()
// }

function changeBlue(){
    let parent = document.getElementById("parent-1");

    setTimeout(() => {
        console.log("Starting change...")
        parent.classList.add('color-bluegradient')
    }, 3000);

    console.log("...changing to blue...");
}

function changeGreen(){
    let parent = document.getElementById("parent-2");

    setTimeout(() => {
        console.log("Starting change...")
        parent.classList.add('color-greengradient')
    }, 3000);

    console.log("...changing to green...");
}
