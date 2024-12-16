const draugai = +prompt("Kiek per menesi susiradot nauju draugu?");
const menesiai = +prompt("Kiek menesiu praejo?");

const turimiDraugai = 5;
result = turimiDraugai + draugai * menesiai;

console.log(
  `Just turejot ${turimiDraugai} draugus bet po ${menesiai} menesiu susiradot ${result} draugu`
);
