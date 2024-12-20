let counter = 0;
let tiesa = true;
let petriukoSaldainiai = Number(prompt("Kiek Petriukas gavo saldainiu"));

// console.log(petriukoSaldainiai);
// console.log(suvalgePerDiena);
// console.log(petriukoSaldainiai - suvalgePerDiena);

while (tiesa) {
  let suvalgePerDiena = Number(prompt("Kiek per diena suvalge?"));
  petriukoSaldainiai = petriukoSaldainiai - suvalgePerDiena;
  counter += 1;
  console.log(petriukoSaldainiai);

  if (petriukoSaldainiai < suvalgePerDiena) {
    tiesa = false;
    const likeSaldainiai = petriukoSaldainiai % suvalgePerDiena;
    console.log(`Petriukui saldainiu uzteks ${counter} dienom`);
    console.log(`Ir jam liks ${likeSaldainiai} saldainiai`);
  }
}
