const forma = document.querySelector(`input[type="text"]`);

forma.addEventListener("focus", function (e) {
  e.target.style.background = "pink";
});

forma.addEventListener("blur", function (e) {
  e.target.style.background = "";
});

console.log(forma);
