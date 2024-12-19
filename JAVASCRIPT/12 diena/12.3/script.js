const forma = document.querySelector("#form-one");
const tekstas = document.querySelector("#kmi");
console.log(forma);

function kmi(skaicius1, skaicius2) {
  const result = skaicius1 / Math.pow(skaicius2 / 100, 2);
  return (tekstas.textContent = result);
}

function validaticija(skaicius1, skaicius2) {
  if (skaicius1 < 0) {
    return (tekstas.textContent = "Svoris negali buti teigiamas");
  } else if (skaicius2 < 0) {
    return (tekstas.textContent = "Ugis negali buti neigiamas");
  } else {
    return kmi(skaicius1, skaicius2);
  }
}

forma.addEventListener("submit", function (e) {
  e.preventDefault();
  const ugi = Number(e.target["height"].value);
  const svoris = Number(e.target["weight"].value);
  validaticija(svoris, ugi);
});
