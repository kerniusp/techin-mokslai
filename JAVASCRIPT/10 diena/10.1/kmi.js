const ugis = Number(prompt("Iveskite savo ugi"));
const svoris = Number(prompt("Iveskite savo svori"));

function kmi(ugis, svoris) {
  const ugisCM = ugis / 100;
  const kmi = svoris / Math.pow(ugisCM, 2);

  if (kmi < 18.5) {
    return "Per mazas svoris";
  } else if (kmi > 18.5 && kmi < 24.9) {
    return "Normalus svoris";
  } else if (kmi > 25.0 && kmi < 29.9) {
    return "Virssvoris";
  } else if (kmi > 30.0 && kmi < 34.9) {
    return "I laipsnio nutukimas";
  } else if (kmi > 35.0 && kmi < 39.9) {
    return "II laipsnio nutukimas";
  } else if (kmi > 40.0) {
    return "III laipsnio nutukimas";
  }
}

console.log(kmi(ugis, svoris));
