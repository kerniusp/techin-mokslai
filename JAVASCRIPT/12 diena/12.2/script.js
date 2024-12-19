const forma = document.querySelector(`[name="number-guess"]`);
const correctNumber = Math.floor(Math.random() * 100 + 1);
console.log(correctNumber);

let counter = 0;

forma.addEventListener("submit", function (e) {
  e.preventDefault();

  const numberInput = Number(e.target["guessed-number"].value);

  const text = document.querySelector("#result-text");
  const result = document.querySelector("#result-count");

  if (numberInput < correctNumber) {
    text.textContent = "Atsakymas per mazas";
    counter += 1;
    result.textContent = counter;
  } else if (numberInput > correctNumber) {
    text.textContent = "Atsakymas per didelis";
    counter += 1;
    result.textContent = counter;
  } else {
    text.textContent = "Atspejote";
    counter += 1;
    result.textContent = counter;
  }
});

console.log(forma);
