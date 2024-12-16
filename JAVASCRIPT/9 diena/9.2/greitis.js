const laikas = +prompt("Iveskite keliones laika valandomis");
const atstumas = +prompt("Iveskite nuvaziuota atstuma");

const greitis = atstumas / laikas;

console.log(`Vidutinis greitis yra ${greitis}km/h`);
