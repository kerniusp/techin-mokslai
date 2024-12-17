const number = Number(prompt("Iveskite skaicius"));

function lyginis(skaicius) {
  if (skaicius % 2 === 0) {
    return "lyginis";
  } else {
    return "nelyginis";
  }
}

console.log(lyginis(number));
