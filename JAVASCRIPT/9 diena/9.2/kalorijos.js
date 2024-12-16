const dienu = +prompt("Kiek kartu per diena valgote");
const pusryciai = +prompt("Iveskite pusryciu kalorijas");
const pietus = +prompt("Iveskite pietu kalorijas");
const vakariene = +prompt("Iveskite vakarienes kalorijas");

const result = pusryciai + pietus + vakariene;
console.log(`Kaloriju skaicius per diena ${result}`);
