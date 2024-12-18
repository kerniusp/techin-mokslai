const mygtukas = document.querySelector("#koment");
const parent = document.querySelector("body");

const vardas = document.createElement("form");
vardas.textContent = "Vardas";

const komentaras = document.createElement("form");
komentaras.textContent = "Komentaras";

const tarpas = document.createElement("br");
const tekstas = document.createElement("input");
tekstas.type = "text";

const didelistekstas = document.createElement("textarea");
const pateikti = document.createElement("button");
pateikti.textContent = "Pateikti";

mygtukas.addEventListener("click", function () {
  parent.appendChild(vardas);
  parent.appendChild(tarpas);
  parent.appendChild(tekstas);
  parent.appendChild(komentaras);
  parent.appendChild(tarpas);
  parent.appendChild(didelistekstas);
  parent.appendChild(pateikti);
});

pateikti.addEventListener("click", function () {
  vardas.remove();
  tarpas.remove();
  tekstas.remove();
  komentaras.remove();
  tarpas.remove();
  didelistekstas.remove();
  pateikti.remove();
  alert("Forma pateikta");
});
