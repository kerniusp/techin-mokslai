const mygtukas = document.querySelector("#prisijungimo-mygtukas");
const arrow = document.querySelector("#arrow");
const forma = document.querySelector(".forma-javascript");

mygtukas.addEventListener("click", function (e) {
  e.preventDefault();

  if (arrow.textContent === "↑") {
    arrow.textContent = "⬇";
    forma.style.display = "block";
  } else if (arrow.textContent === "⬇") {
    arrow.textContent = "↑";
    forma.style.display = "none";
  }
});
