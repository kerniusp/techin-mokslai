const forma = document.querySelector(`[name="todo-list"]`);
const parent = document.querySelector("#list");

console.log(forma);

forma.addEventListener("submit", function (e) {
  e.preventDefault();
  const tekstas = e.target["task"].value;
  const newLI = document.createElement("li");
  newLI.textContent = tekstas;
  parent.appendChild(newLI);
});
