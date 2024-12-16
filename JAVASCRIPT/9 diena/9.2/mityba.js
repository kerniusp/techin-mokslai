const pirm = +prompt("Kiek kartu valgysite pirmadieni?");
const antra = +prompt("Kiek kartu valgysite antradieni?");
const trec = +prompt("Kiek kartu valgysite treciadieni?");
const ketvi = +prompt("Kiek kartu valgysite ketvirtadieni?");
const penk = +prompt("Kiek kartu valgysite penktadienie?");
const sest = +prompt("Kiek kartu valgysite sestadieni");
const sekm = +prompt("Kiek kartu valgysite sekmadieni?");

const result = pirm + antra + trec + ketvi + penk + sest + sekm;

console.log(`Is viso per savaite valgysite ${result}`);