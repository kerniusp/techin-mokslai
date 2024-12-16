const mariausSaldainiai = +prompt("Kiek saldainiu gauna Marius");
const kiekSaldainiuSuvalgo = +prompt("Kiek saldainiu suvalgo Marius");
const dienosIkiKaledu = +prompt("Kiek dienu liko iki kaledu?");

const SukauptiSaldainiai =
  (mariausSaldainiai - kiekSaldainiuSuvalgo) * dienosIkiKaledu;

const likeSaldainiai = SukauptiSaldainiai % kiekSaldainiuSuvalgo;
const dovanotiSaldainiai =
  (SukauptiSaldainiai - likeSaldainiai) / kiekSaldainiuSuvalgo;

console.log(`Marius dovanas paruos ${dovanotiSaldainiai} draugu`);
console.log(`Supakavus dovanas liks ${likeSaldainiai} saldainiai`);
