const mygtukas = document.querySelector("button");
const fonas = document.querySelector("body");

const setBg = () => {
  let randomColor = Math.floor(Math.random() * 16777215).toString(16);
  document.body.style.backgroundColor = "#" + randomColor;
  color.innerHTML = "#" + randomColor;
};

mygtukas.addEventListener("click", function () {
  fonas.style.backgroundColor = setBg();
});
