const vardai = ["Jonas", "Domas", "Tomas", "Rasa", "Ginatre"];

function VardoPridejimas (vardai) {
    vardai.push("Karolis");
    console.log(vardai);
}

function VardoAtemimas (vardai) {
    vardai.splice(1,1);
    console.log(vardai);
}

VardoPridejimas(vardai);
VardoAtemimas(vardai);


console.log(vardai.sort());