const diena = Number(prompt("Iveskite dienas"));

function daysToHoursToMinutes(dienos) {
  const valandos = dienos * 24;
  const minutes = valandos * 60;
  const total = `${dienos} yra ${valandos} valandos, arba ${minutes} minutes`;
  return total;
}

console.log(daysToHoursToMinutes(diena));
