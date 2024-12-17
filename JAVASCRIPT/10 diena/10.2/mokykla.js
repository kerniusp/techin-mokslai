const zingsniai = Number(prompt("Iveskite zingsniu kieki iki mokyklos"));
let plojimai = 0;
let spragtelijimai = 0;

for (let i = 1; i <= zingsniai; i++) {
  if (i % 10 === 0) {
    plojimai = plojimai + 1;
  } else if (i % 10 === 5) {
    spragtelijimai = spragtelijimai + 1;
  }
}

console.log(`Suplojimu bus ${plojimai}`);
console.log(`Spragtelejimu bus ${spragtelijimai}`);
