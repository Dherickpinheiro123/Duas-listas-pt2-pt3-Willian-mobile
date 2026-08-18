let impares = [];

for (let i = 0; i <= 200; i++) {

    if (i % 2 !== 0) {
        impares.push(i);
    }
}

console.log("Números ímpares:");

for (let i = 0; i < impares.length; i++) {
    console.log(impares[i]);
}