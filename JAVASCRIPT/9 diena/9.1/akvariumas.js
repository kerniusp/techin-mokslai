const akvariumas = +prompt("Kiek zuvu gyvena akvariume? ");
const idejoZuvu = +prompt("Kiek zuvu i akvariuma idedama kiekviena diena?");
const dienuPraiejo = +prompt("Kiek dienu praejo?");

const result = idejoZuvu * dienuPraiejo + akvariumas;
console.log(`Po ${dienuPraiejo} dienu akvariume gyvens ${result} zuvu`);
