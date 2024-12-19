const forma = document.querySelector("#arbatpinigiu-skaiciuokle");

function apskaiciavimas(suma, pasirinkimas, zmones) {
  switch (pasirinkimas) {
    case 1:
      let ats = ((30 / 100) * suma) / zmones;
      return ats;
    case 2:
      ats = ((20 / 100) * suma) / zmones;
      return ats;
    case 3:
      ats = ((10 / 100) * suma) / zmones;
      return ats;
    case 4:
      ats = ((5 / 100) * suma) / zmones;
      return ats;
    case 5:
      ats((1 / 100) * suma) / zmones;
      return ats;
  }
}

forma.addEventListener("submit", function (e) {
  e.preventDefault();
  const suma = Number(e.target["sas-suma"].value);
  const aptarnavimas = Number(e.target["aptarnavimas"].value);
  const skaicius = Number(e.target["skaicius"].value);

  const atsakymas = apskaiciavimas(suma, aptarnavimas, skaicius);
  console.log(atsakymas);
  const newP = document.querySelector("#atsakymas");
  newP.textContent = `Arbatpinigiai ${atsakymas} Kiekvienam!`;
});
