const spalvotas = document.querySelector("#spalvotas");
const nespalvotas = document.querySelector("#nespalvotas");
const nuotrauka = document.querySelector("img");

spalvotas.addEventListener("click", function () {
  nuotrauka.style.filter = "invert(0.30)";
});

nespalvotas.addEventListener("click", function () {
  nuotrauka.style.filter = "invert(0)";
});
