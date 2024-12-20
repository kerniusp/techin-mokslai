const egles = Number(prompt("Kiek eglutciu atvezta?"));
let totalaukstis = 0;
for (let i = 1; i <= egles; i++) {
  let aukstis = Number(prompt(`Iveskite ${i} eglutes auksti`));
  totalaukstis += aukstis;
}

const vidurkis = totalaukstis / egles;

console.log(`Eglutes aukscio vidurkis: ${vidurkis}`);
