const rusis1 = Number(prompt("Iveskite kiek liko pauksciu ziemoti"));
const rusis2 = Number(prompt("Iveskite kiek liko pauksciu ziemoti"));
const rusis3 = Number(prompt("Iveskite kiek liko pauksciu ziemoti"));

let didziausias;
let vidurinis;
let maziausas;

if (rusis1 >= rusis2 && rusis1 >= rusis3) {
  didziausias = rusis1;
  if (rusis2 >= rusis3) {
    vidurinis = rusis2;
    maziausas = rusis3;
  } else {
    vidurinis = rusis3;
    maziausas = rusis2;
  }
} else if (rusis2 >= rusis1 && rusis2 >= rusis3) {
  didziausias = rusis2;
  if (rusis1 >= rusis3) {
    vidurinis = rusis1;
    maziausas = rusis3;
  } else {
    vidurinis = rusis3;
    maziausas = rusis1;
  }
} else {
  didziausias = rusis3;
  if (rusis1 >= rusis2) {
    vidurinis = rusis1;
    maziausas = rusis2;
  } else {
    vidurinis = rusis2;
    maziausas = rusis1;
  }
}
console.log(`${didziausias} ${vidurinis} ${maziausas}`);

let skirtumas = didziausias - maziausas;
console.log(`Skirtumas tarp didziausio ir maziausiau ${skirtumas}`);
