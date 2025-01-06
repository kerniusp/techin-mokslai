function TeigiamuSkaiciuSuma() {
  let suma = 0;

  while (true) {
    let skaicius = Number(prompt("Iveskite skaiciu"));

    if (skaicius < 0) {
      break;
    } else {
      suma += skaicius;
    }
  }
  return console.log(suma);
}

TeigiamuSkaiciuSuma();
