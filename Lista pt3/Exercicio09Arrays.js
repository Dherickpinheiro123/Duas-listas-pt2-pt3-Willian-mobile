let array1 = [
    1, 2, 3, 4, 5,
    6, 7, 8, 9, 10
];

let array2 = [
    11, 12, 3, 14, 15,
    16, 7, 18, 19, 20
];

let numerosIguais = [];

for (let i = 0; i < array1.length; i++) {

    for (let j = 0; j < array2.length; j++) {

        if (array1[i] === array2[j]) {

            if (!numerosIguais.includes(array1[i])) {
                numerosIguais.push(array1[i]);
            }
        }
    }
}

console.log("Array 1:");
console.log(array1);

console.log("Array 2:");
console.log(array2);

console.log("Números iguais:");
console.log(numerosIguais);