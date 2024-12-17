const pazymys = Number(prompt("Iveskite pazymi"));

function findGrade(skaicius) {

  if (skaicius > 0 && skaicius <= 29) {
    return "failed";
  } else if (skaicius > 29 && skaicius <= 34) {
    return 1;
  } else if (skaicius > 34 && skaicius <= 39) {
    return 2;
  } else if (skaicius > 39 && skaicius <= 44) {
    return 3;
  } else if (skaicius > 44 && skaicius <= 49) {
    return 4;
  } else if (skaicius > 50 && skaicius <= 60) {
    return 5;
  } else {
    return "toks pazymys neegsiztuoja";
  }
}
console.log(findGrade(pazymys));
