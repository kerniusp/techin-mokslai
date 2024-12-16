const ilgesnis = +prompt("Iveskite ilgesniojo pagrindo ilgi: ");
const trumpesnis = +prompt("Iveskite trumpesniojo pagrindo ilgi: ");
const aukstis = +prompt("Iveskite trapecijos auksti");

const result = ((ilgesnis + trumpesnis) / 2) * aukstis;

console.log(`Trapecijos plotas: ${result}`);
