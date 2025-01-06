const skaicius = Number(prompt("Iveskite skaiciu"));
let suma = 0;

function LyginisSkaicius(numeris) {
  for (let i = 0; i < numeris; i++) {
    if (i % 2 === 0) {
      suma += i;
    }
  }
  return suma;
}

console.log(LyginisSkaicius(skaicius));
