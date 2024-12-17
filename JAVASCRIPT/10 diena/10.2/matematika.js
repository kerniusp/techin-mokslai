const pazymis1 = Number(prompt("Koki pazymi gavo petriukas?"));
const pazymis2 = Number(prompt("Koki pazymi gavo petriukas?"));
const pazymis3 = Number(prompt("Koki pazymi gavo petriukas?"));
const pazymis4 = Number(prompt("Koki pazymi gavo petriukas?"));
const pazymis5 = Number(prompt("Koki pazymi gavo petriukas?"));

const suma = pazymis1 + pazymis2 + pazymis3 + pazymis4 + pazymis5;
const vidurkis = suma / 5;

if (vidurkis > 9) {
  console.log("Petriukas gaus tris saldainius");
  console.log(vidurkis);
} else if (vidurkis >= 7 && vidurkis <= 9) {
  console.log("Petriukas gaus du saldainius");
} else if (vidurkis < 7) {
  console.log("Petriukas gaus viena saldaini");
}
