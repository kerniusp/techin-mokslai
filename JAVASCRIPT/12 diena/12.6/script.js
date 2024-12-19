const forma = document.querySelector("form");
const background = document.querySelector("body");

function nuotrauka(number) {
  switch (parseInt(number)) {
    case 1:
      background.style.backgroundImage = "url(pavasaris.jpg)";
      break;
    case 2:
      background.style.backgroundImage = "url(summer.jpg)";
      break;
    case 3:
      background.style.backgroundImage = "url(ruduo.jpg)";
      break;
    case 4:
      background.style.backgroundImage = "url(ziema.jpg)";
    default:
      console.log("testas");
  }
}

forma.addEventListener("change", function (e) {
  const optionas = Number(e.target.value);
  nuotrauka(optionas);
});

// console.log(forma);
// console.log(background);

// forma.addEventListener("change", function () {
//   const pasirinkimas = document.querySelector("#id-of-select");
//   const pasirinkimoValue = pasirinkimas.value;
//   console.log(pasirinkimoValue);

//   nuotrauka(pasirinkimoValue);
// });
