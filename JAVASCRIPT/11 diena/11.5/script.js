const mygtukas = document.querySelector("button");
const tekstas = document.querySelector("p");
const parent = document.querySelector("body");

const newH1 = document.createElement("h1");
newH1.textContent = "Pavadinimas";

mygtukas.addEventListener("click", function () {
  parent.insertBefore(newH1, tekstas);
});
