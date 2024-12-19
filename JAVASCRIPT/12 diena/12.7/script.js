const mainNuotrauka = document.querySelector("div.col-12 > div > img");
const nuotrauka1 = document.querySelector("div:nth-child(2) > img");
const nuotrauka2 = document.querySelector("div:nth-child(3) > img");
const nuotrauka3 = document.querySelector("div:nth-child(4) > img");
const nuotrauka4 = document.querySelector("div:nth-child(5) > img");
const tekstas = document.querySelector("p");

nuotrauka1.addEventListener("click", function () {
  mainNuotrauka.src = "kalnai.png";
  tekstas.textContent = "Kalnai";
});

nuotrauka2.addEventListener("click", function () {
  mainNuotrauka.src = "kalnai2.png";
  tekstas.textContent = "Oro balionas";
});

nuotrauka3.addEventListener("click", function () {
  mainNuotrauka.src = "kelias.png";
  tekstas.textContent = "Kelias";
});

nuotrauka4.addEventListener("click", function () {
  mainNuotrauka.src = "dangus.png";
  tekstas.textContent = "dangus";
});
