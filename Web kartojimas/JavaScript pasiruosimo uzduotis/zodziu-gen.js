const zodziai = ["JavaScript","kodas","kompiuteris"];

const input = Number(prompt("Iveskite skaiciu nuo 1 iki 3"));

switch(input){
    case 1:
        console.log(zodziai[0]);
        break;
    case 2:
        console.log(`${zodziai[0]}  ${zodziai[1]}`);
        break;
    case 3:
        console.log(`${zodziai[0]} ${zodziai[1]} ${zodziai[2]}`)    
        break;
}
