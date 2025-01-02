let ugisSelector = document.querySelector("#ugis");
let svorisSelector = document.querySelector("#svoris");
const button = document.querySelector("#button");
const text = document.querySelector("#answer-span");

console.log(ugisSelector);

function kmi(svoris, ugis) {
    ugis = ugis / 100;
    return ats = svoris / (ugis * ugis);
}

button.addEventListener("click", function (e) {
    e.preventDefault();

    let ugis = Number(ugisSelector.value);
    let svoris = Number(svorisSelector.value);

    text.textContent = "Jusu kmi yra " + parseFloat(kmi(svoris, ugis)).toFixed(2);
    console.log(ugis);
    console.log(svoris);
});

