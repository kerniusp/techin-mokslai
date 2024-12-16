const tunelis = 264;
let greitis = +prompt("Koks automobilio greitis?");

const tunelisKm = 264 / 1000;
let greitisSec = greitis / 3600;
const result = tunelisKm / greitisSec;

console.log(`Automoblis tuneli pravaziuos per ${result}`);
