const kodas = Number(prompt("Iveskite koda"));

function atkodavimas(skaicius1) {
  switch (skaicius1) {
    case 1:
      return "Sauleta";
      break;
    case 2:
      return "lietinga";
      break;
    case 3:
      return "vejuota";
      break;
    case 4:
      return "sniegas";
      break;
    default:
      return "Kodas turi buti nuo 1 iki 4";
  }
}

console.log(atkodavimas(kodas));
