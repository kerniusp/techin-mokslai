const klase1 = Number(prompt("Iveskite klases vidurki:"));
const klase2 = Number(prompt("Iveskite klases vidurki:"));
const klase3 = Number(prompt("Iveskite klases vidurki:"));
const klase4 = Number(prompt("Iveskite klases vidurki:"));
let skirtumas1 = 0;
let skirtumas2 = 0;
let skirtumas3 = 0;

if (klase1 > klase2 && klase1 > klase3 && klase1 > klase4) {
  console.log("didziausia klases vidurkis" + klase2);
  skirtumas1 = klase1 - klase2;
  skirtumas2 = klase1 - klase3;
  skirtumas3 = klase1 - klase4;
  console.log(`${skirtumas1} ${skirtumas2} ${skirtumas3}`);
} else if (klase2 > klase1 && klase2 > klase3 && klase2 > klase4) {
  console.log("didziausia klases vidurkis" + klase2);
  skirtumas1 = klase2 - klase1;
  skirtumas2 = klase2 - klase3;
  skirtumas3 = klase2 - klase4;
  console.log(`${skirtumas1} ${skirtumas2} ${skirtumas3}`);
} else if (klase3 > klase1 && klase3 > klase2 && klase3 > klase4) {
  console.log("didziausia klases vidurkis" + klase2);
  skirtumas1 = klase3 - klase1;
  skirtumas2 = klase3 - klase2;
  skirtumas3 = klase3 - klase4;
  console.log(`${skirtumas1} ${skirtumas2} ${skirtumas3}`);
} else {
  console.log("didziausia klases vidurkis" + klase2);
  skirtumas1 = klase4 - klase1;
  skirtumas2 = klase4 - klase2;
  skirtumas3 = klase4 - klase3;
  console.log(`${skirtumas1} ${skirtumas2} ${skirtumas3}`);
}
