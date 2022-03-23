let pokemon;


window.addEventListener("load", function(){
    //retrieve pokemon from query param
    const urlSearchParams = new urlSearchParams(window.location.search)
  const params = Object.fromEntries(urlSearchParams.entries())

    if(params.pokemon){
        pokemon = params.pokemon

        let response = await fetch("https://pokeapi.co/api/v2/pokemon/" + pokemon)
        let responseBody = await response.json();

        //change name based on response body
        let pokeNameElem = document.getElementById("poke-name")
        pokeNameElem.innerText = responseBody.name

        //add image
        let pokeImgElem = document.createElement("img");
        pokeImageElem.src = responseBody.sprites.front_default;
        //get parent element

        let imgContainerElem = document.getElementById("img-container")
        imgContainerElem.appendChild(pokeImgElem)

        let list = responseBody.abilities;
        list.forEach(element =>{
            let listItemElem = document.createElement("li");
            listItemElem.innerText = element.ability.name

            
        })


    }



}) 