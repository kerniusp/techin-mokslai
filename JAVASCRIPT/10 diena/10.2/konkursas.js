let intervaloPradzia = Number(prompt("Iveskite intervalo pradzia"));
const intervaloPabaiga = Number(prompt("Iveskite intervalo pabaiga"));
let count = 0;
for (
  intervaloPradzia;
  intervaloPradzia <= intervaloPabaiga;
  intervaloPradzia++
) {
  if (intervaloPradzia % 6 === 0) {
    count = count + 1;
  }4
}
console.log(`Reikalingu marskineliu skaicius ${count}`);
