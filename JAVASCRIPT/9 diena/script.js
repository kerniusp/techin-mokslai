const pirm = +prompt("Kiek pamoku yra pirmadieni?");
const ant = +prompt("Kiek pamoku yra antradieni?");
const trec = +prompt("Kiek pamoku yra treciadieni?");
const ketv = +prompt("Kiek pamoku yra Ketvirtadieni?");
const penkt = +prompt("Kiek pamoku yra penktadienie?");

const result = pirm + ant + trec + ketv + penkt;
const resultMin = result * 45;

console.log(`Pamoku skaicius: ${result}`);
console.log(`Tai sudaro minuciu ${resultMin}`);
