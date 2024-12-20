let snaiges = Number(prompt("Kiek snaigiu nukrito"));
const sekundes = Number(prompt("Kiek laiko snigo"));

let sum = 0;

for (let i = 1; i <= sekundes; i++) {
  sum = sum + snaiges;
  snaiges = snaiges * 2;
}
console.log(sum);
