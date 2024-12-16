let moneta5 = +prompt("Kiek yra monetu po 5 ct? ");
let moneta20 = +prompt("Kiek yra monetu po 20 ct? ");
let litas2 = +prompt("Kiek monetu po 2 Lt? ");

moneta5 = moneta5 * 0.05;
moneta20 = moneta20 * 0.2;
litas2 = litas2 * 2;
const result = moneta5 + moneta20 + litas2;

console.log(`Taupykleje yra ${result}`);
