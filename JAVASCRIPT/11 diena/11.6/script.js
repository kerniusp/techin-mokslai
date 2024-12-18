const kaire = document.querySelector("#kaire-mygtukas");
const desine = document.querySelector("#desine-mygtukas");
const paslepti = document.querySelector("#paslepti-mygtukas");
const nukelti = document.querySelector("#nukelti-mygtukas");
const atstatyti = document.querySelector("#atstatyti-mygtukas");

const nuotrauka = document.querySelector("img");

const parent = document.querySelector("body");
const p = document.querySelector("#first-p");

kaire.addEventListener("click", function () {
  nuotrauka.style.float = "left";
});

desine.addEventListener("click", function () {
  nuotrauka.style.float = "right";
});

paslepti.addEventListener("click", function () {
  nuotrauka.style.visibility = "hidden";
});

nukelti.addEventListener("click", function () {
  parent.appendChild(nuotrauka);
});

atstatyti.addEventListener("click", function () {
  nuotrauka.style.visibility = "visible";
  nuotrauka.style.float = "none";
  parent.insertBefore(nuotrauka, p);
});

console.log(atstatyti);
console.log(nuotrauka);
