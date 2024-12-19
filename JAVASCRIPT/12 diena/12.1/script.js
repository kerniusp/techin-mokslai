const forma = document.querySelector("#form-one");

forma.addEventListener("submit", function (e) {
  e.preventDefault();

  const pirmasSkaicius = Number(e.target["first-number"].value);
  const antrasSkaicius = Number(e.target["second-number"].value);

  const suma = pirmasSkaicius + antrasSkaicius;
  const parodyti = document.querySelector("#sum");
  parodyti.textContent = suma;
});

// const parent = document.querySelector("p");
// parent.appendChild(parodyti);

// console.log(forma);
