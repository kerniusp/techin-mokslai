
//Sukuriua masyva su penkiom salim
const salys = ["Estija", "Latvija", "Chadas", "JAV", "Taiwanas"]; 

// isvedu pirma ir paskutini masyvo elementa
console.log(
  `Pirma salys ${salys[0]} bei paskutine salys ${salys[salys.length - 1]}`
);

// pridedu dar viena sali
salys.push("Brazilija");

// pakeiciu masyvo trecio elementa i Lietuva
salys[3] = "Lietuva";

// isvedu visus masyvo elementus.
console.log(salys);
