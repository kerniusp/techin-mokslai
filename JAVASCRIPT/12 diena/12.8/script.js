const forma = document.querySelector("#arbatpinigiu-skaiciuokle");

function apskaiciavimas(suma, pasirinkimas, zmones) {
  const atsakymmas = ((pasirinkimas / 100) * suma) / zmones;
  return atsakymmas;
}

forma.addEventListener("submit", function (e) {
  e.preventDefault();
  const suma = Number(e.target["sas-suma"].value);
  const aptarnavimas = Number(e.target["aptarnavimas"].value);
  const skaicius = Number(e.target["skaicius"].value);

  const atsakymas = apskaiciavimas(suma, aptarnavimas, skaicius);

  const newP = document.querySelector("#atsakymas");
  newP.textContent = `Arbatpinigiai ${atsakymas}$ Kiekvienam!`;
});
