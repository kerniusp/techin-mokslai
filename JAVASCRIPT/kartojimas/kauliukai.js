const kiekis = Number(prompt("Iveskite galimu kauliuku kieki"));
let bendras = 0;

for (let i = 1; i <= kiekis; i++) {
  let randomNumber = Math.floor(Math.random() * 6) + 1;
  console.log(`${i}-o kauliuko tasku kiekis:${randomNumber}`);
  bendras += randomNumber;
}

console.log("Is viso buvo galima surinkti " + kiekis * 6);
console.log(`Tomas is viso surinko ${bendras}`);
console.log("Jo tasku vidurkis: " + bendras / kiekis);
