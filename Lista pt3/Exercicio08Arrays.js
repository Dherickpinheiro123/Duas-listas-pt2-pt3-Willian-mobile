let numeros = [
    10,
    20,
    30,
    20,
    40,
    50,
    10,
    60,
    70,
    30
];

let semRepetidos = [];

for (let i = 0; i < numeros.length; i++) {

    if (!semRepetidos.includes(numeros[i])) {
        semRepetidos.push(numeros[i]);
    }
}

console.log("Array original:");

console.log(numeros);

console.log("Array sem números repetidos:");

console.log(semRepetidos);