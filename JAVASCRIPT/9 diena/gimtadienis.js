const tautvydoSausainiai = +prompt("Kiek sausainiu iskepe Tautvydas?");
const drauguPapildomiSausainiai = +prompt(
  "Kiek draugu atsinese tiek pat sausainiu?"
);
const dalyviai = +prompt("Kiek zmoniu dalyvavo sventeje?");

const totalSausainiai =
  tautvydoSausainiai + tautvydoSausainiai * drauguPapildomiSausainiai;
const isdalintisSausainiai = totalSausainiai % dalyviai;
const papildomiSausainiai = (totalSausainiai - isdalintisSausainiai) / dalyviai;

console.log(`Isdalinta ${isdalintisSausainiai}`);
console.log(`Tautvydui papildomai atiteko ${papildomiSausainiai}`);
