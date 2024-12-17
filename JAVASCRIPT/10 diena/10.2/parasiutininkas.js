const aukstis = Number(prompt("Is kokio aukscio soka parasiutininkas?"));
const sekundes = Number(
  prompt("Per kiek sekendziu issiskleidzia jo parasiutas")
);

const g = Math.pow(9.8, 2);
const time = Math.sqrt((2 * aukstis) / g);

if (time > sekundes) {
  console.log("Parasiutas issiskleis");
} else {
  console.log("Parasiutas neissiskleis");
}
