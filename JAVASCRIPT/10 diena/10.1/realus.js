const number = Number(prompt("Iveskite x skaicius"));

function formule(skaicius) {
  return 16 * Math.pow(skaicius, 4) + 2 * skaicius;
}

console.log(formule(number));
