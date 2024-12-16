const voniosTalpa = +prompt("Iveskite vonios talpa litrais");
const tekejimoGreitis = +prompt(
  "Iveskite vandens tekejimo greiti litrais per minute"
);

const result = voniosTalpa / tekejimoGreitis;
console.log(`Vonia uzsipildys per ${result} minutes`);
