const ilgis = +prompt("Sienos ilgis metrais ?");
const aukstis = +prompt("Sienos aukstis metrais?");
const kaina = 0.5;

const sienosPlotisCm = (ilgis * aukstis)* 100;
const plytosPlotasCm = (20 * 10) / 100;

const plytuKiekis = sienosPlotisCm / plytosPlotasCm;
const plytuKaina = plytuKiekis * kaina;

console.log(`Plytu kiekis ${plytuKiekis}`);
console.log(`Plytu kaina ${plytuKaina} Lt`);3
