'use strict';

// SELECTORS
// Inputs
let addMonsterName = document.querySelector("#monsterName");
let addMonsterFamily = document.querySelector("#monsterFamily");
let addMonsterDiet = document.querySelector("#monsterDiet");
let addMonsterFlight = document.querySelector("#monsterFlight");
let addMonsterSwim = document.querySelector("#monsterSwim");
let addMonsterOrigin = document.querySelector("#monsterOrigin");
let searchMonsterFamily = document.querySelector("#searchByFamily");
let searchMonsterDiet = document.querySelector("#searchByDiet");

// Buttons
let addMonsterButton = document.querySelector("#addMonster");
let searchFamily = document.querySelector("#familySearchButton");
let searchDiet = document.querySelector("#dietSearchButton");

// Divs
let inputFormDiv = document.querySelector("#inputDiv");
let dataDiv = document.querySelector("#dataDiv");
let monsterAddForm = document.querySelector("#monsterAddForm");


// FUNCTIONS
let setup = () => {
    dataDiv.innerHTML="<h3><b><u>Existing Monsters</u></b></h3>";
    axios.get("http://localhost:8080/monstermaker/getAll")
        .then((response) => {
            displayResult(response.data);
        })
        .catch((err) => {
            console.error(err);
        });
}


let create = () => {

    let obj = {
        "monsterName":addMonsterName.value,
        "monsterFamily":addMonsterFamily.value,
        "monsterDiet":addMonsterDiet.value,
        "monsterFlight":addMonsterFlight.checked,
        "monsterSwim":addMonsterSwim.checked,
        "monsterOrigin":addMonsterOrigin.value
    }

    console.log(obj);

    axios.post("http://localhost:8080/monstermaker/create", obj)
        .then((response) => {
            console.log(response);
            setup();
        })
        .catch((err) => {
            console.error(err);
        });
    
}

let remove = (idVal) => {
    axios.delete(`http://localhost:8080/monstermaker/delete/${idVal}`)
        .then((response) => {
            displayResult(response.data);
            setup();
        })
        .catch((err) => {
            console.error(err);
        });
}

let update = () => {
    axios.put(`http://localhost:8080/monstermaker/update/${updateBtn.value}`)
        .then((response) => {
            console.log(response);
        })
}



let searchByFamily = () => {
    axios.get(`http://localhost:8080/monstermaker/getByFamily/${searchMonsterFamily.value}`)
    let familyDiv = document.createElement("div");
    familyDiv.innerHTML = `<h2>Search Results:</h2><br><p>${obj}</p>`;
}

let displayResult = (data) => {
    for (let entry of data) {
        let entryDiv = document.createElement("div");
        entryDiv.setAttribute("class","entryDiv");
        dataDiv.appendChild(entryDiv);
        
        let tableDiv = document.createElement("div");
        tableDiv.setAttribute("class","tables");
        
        const text = document.createTextNode(`Monster Name: ${entry.monsterName} | 
        Monster Family: ${entry.monsterFamily} | 
        Monster Diet: ${entry.monsterDiet} | 
        Monster Flight Ability: ${entry.monsterFlight} | 
        Monster Swim Ability: ${entry.monsterSwim} | 
        Monster Origin: ${entry.monsterOrigin}`);
        tableDiv.appendChild(text);
        entryDiv.appendChild(tableDiv);
        
        let btnDiv = document.createElement("div");
        btnDiv.setAttribute("class","buttonDiv");
        
        let updateBtn = document.createElement("button");
        updateBtn.setAttribute("class","btn btn-warning");
        updateBtn.setAttribute("value",`${entry.monster_id}`);
        updateBtn.innerHTML="Update Entry";
        
        let deleteBtn = document.createElement("button");
        deleteBtn.setAttribute("class","btn btn-danger");
        deleteBtn.setAttribute("value",`${entry.monsterId}`);
        deleteBtn.innerHTML="Delete Entry";
        btnDiv.appendChild(updateBtn);
        btnDiv.appendChild(deleteBtn);
        tableDiv.appendChild(btnDiv);

        updateBtn.addEventListener("click", update);
        deleteBtn.addEventListener("click", function(){remove(entry.monsterId);});
    }
}


// EVENT LISTENERS
addMonsterButton.addEventListener("click", create);
searchFamilyButton.addEventListener("click", searchByFamily);

