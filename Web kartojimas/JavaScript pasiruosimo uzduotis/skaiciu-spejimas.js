let boolean = true;
let randomNumber = Math.floor(Math.random() * 10);

while (boolean) {
    let SpejimoInput = prompt("Ar norite speti skaiciu?");
    if (SpejimoInput === "Taip") {
        let Skaicius = Number(prompt("Iveskites skaicius"));
        console.log(randomNumber)
        if (Skaicius === randomNumber) {
            console.log("Atspejote teisingai!");
        } else if (Skaicius != randomNumber) {
            console.log("Neatspejote");
        }
    } else if (SpejimoInput === "Ne") {
        boolean = false;
    }
}