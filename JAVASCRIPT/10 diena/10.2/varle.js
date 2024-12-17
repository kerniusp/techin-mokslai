const svoris = Number(prompt("Kiek sveria varle?"));
const kiekis = Number(prompt("Kiek varliu norima stebeti?"));

function stebijimas(skaicius1, skaicius2) {
  const size = skaicius1 * skaicius2;
  if (size > 5000) {
    return "Varliu stebejimui pakanka";
  } else {
    return "Varliu stebejimui per mazai";
  }
}

console.log(stebijimas(svoris, kiekis));
