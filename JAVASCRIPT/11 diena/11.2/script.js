const tekstas = document.querySelector("p");

const geltonas = document.querySelector("#geltonas-mygtukas");
const zalias = document.querySelector("#zalias-mygtukas");
const raudonas = document.querySelector("#raudonas-mygtukas");

geltonas.addEventListener("click", function () {
  tekstas.style.color = "yellow";
});

zalias.addEventListener("click", function () {
  tekstas.style.color = "green";
});

raudonas.addEventListener("click", function(){
    tekstas.style.color = "red";
});
console.log(geltonas);
console.log(tekstas);
