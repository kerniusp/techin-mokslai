const puodeliai = +prompt("Puodeliu kuriuos reikia supakuoti: ");

const nesupakuotas = puodeliai % 3;
const supakuotas = (puodeliai - nesupakuotas) / 3;

console.log(`Supakuotu puodeliu skaicius ${supakuotas}`);
console.log(`Nesupakuotu puodeliu skaicius ${nesupakuotas}`);
