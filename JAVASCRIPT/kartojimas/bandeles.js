const kainaA = Number(prompt("Iveskite kaina a"));
const kainaB = Number(prompt("Iveskite kaina b"));

const kiekis1 = Number(prompt("Iveskite bandeliu kieki:"));
const kiekis2 = Number(prompt("Iveskite bandeliu kieki:"));
const kiekis3 = Number(prompt("Iveskite bandeliu kieki:"));

const kaina = Number(prompt("Iveskite bandeliu kaina"));
console.log("Testas12");
if (kainaA < kaina) {
  let ats1 = kaina * kiekis1;
  console.log(ats1 + "variantas pirmas");
} else if (kaina > kainaA && kainaB < kaina) {
  let ats2 = kaina * kiekis2;
  console.log(ats2 + "variantas antras");
} else if (kainaB > kaina && kaina > kainaA) {
  let ats3 = kaina * kiekis3;
  console.log(ats3 + "variantas trecias");
}
