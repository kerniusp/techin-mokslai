let suma = 0;
let counter = 0;
let ats = 0;

for (let i = 1; i <= 50; i++) {

    if (i % 2 == 0) {
        suma += i;
        counter += 1;
        ats = suma / counter;

    }
    
}
console.log(ats);