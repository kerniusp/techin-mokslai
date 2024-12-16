const sunaudotaElektra = +prompt("Iveskite kiek per diena sunaudojate kWh");
const dienosMen = +prompt("Iveskite kiek dienu yra menesyje");

const result = sunaudotaElektra * dienosMen;

console.log(`Jus per menesi sunaudojat ${result} kWh`);
