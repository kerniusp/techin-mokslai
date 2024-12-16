const akvariumas = +prompt("Kiek zuvu gyvena akvariume? ");
const ideti = +prompt("Kiek zuvu i akvariuma idedama kiekviena diena?");
const diena = +prompt("Kiek dienu praejo?");

const result = ideti * diena + akvariumas;
console.log(`Po ${diena} dienu akvariume gyvens ${result} zuvu`);
