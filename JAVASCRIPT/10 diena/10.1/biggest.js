const skaiciusA = Number(prompt("Iveskite skaicius a"));
const skaiciusB = Number(prompt("Iveskites skaicius b"));

//a salygine funkcija
function didziausias(skaicius1, skaicius2) {
  if (skaicius1 > skaicius2) {
    return skaicius1;
  } else if (skaicius1 < skaicius2) {
    return skaicius2;
  } else {
    return "skaiciai yra lygus";
  }
}
//b Ternary operator
function didziausias2(skaicius1, skaicius2) {
  return skaicius1 > skaicius2 ? skaicius1 : skaicius2;
}
5
//c Math object
function didziausias3(skaicius1,skaicius2){
    return Math.max(skaicius1, skaicius2);
}

console.log(didziausias(skaiciusA, skaiciusB));
console.log(didziausias2(skaiciusA, skaiciusB));
console.log(didziausias3(skaiciusA,skaiciusB));
