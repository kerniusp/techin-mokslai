const auto = +prompt("Automobiliu skaicius:");
const keltas = +prompt("I kelta telpa autombiliu:");

const netelpa = auto % keltas;
const telpa = (auto - netelpa) / keltas;

console.log(`Perkels per kartu ${telpa}`);
console.log(`Liks neperkelta ${netelpa}`);
