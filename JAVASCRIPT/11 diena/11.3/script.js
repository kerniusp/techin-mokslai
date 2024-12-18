const pliusas = document.querySelector("#didinti");
const minusas = document.querySelector("#mazinti");

const nuotrauka = document.querySelector("img");

pliusas.addEventListener("click", function () {
  nuotrauka.style.width = "500px";
});

minusas.addEventListener("click", function () {
  nuotrauka.style.width = "220px";
});

console.log(pliusas);
console.log(minusas);
console.log(nuotrauka);
