const spalvotas = document.querySelector("#spalvotas");
const nespalvotas = document.querySelector("#nespalvotas");
const nuotrauka = document.querySelector("img");

spalvotas.addEventListener("click", function () {
  nuotrauka.setAttribute("src", "blackntr.png");
});

nespalvotas.addEventListener("click", function () {
  nuotrauka.setAttribute("src", "ntr.png");
});
