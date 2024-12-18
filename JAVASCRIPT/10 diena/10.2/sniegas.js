const snaiges = Number(prompt("Kiek snaigiu nukrito"));
const sekundes = Number(prompt("Kiek laiko snigo"));
const bendras = snaiges * sekundes;

for (let i = 0; i <= sekundes; i++) {
  console.log(bendras);
  if (i > 1) {
    let pakelti = Math.pow(bendras, 2);
  }
}
console.log(bendras);
