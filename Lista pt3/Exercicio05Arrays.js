let notas = [7.5, 8.0, 6.5, 9.0];

let soma = 0;

for (let i = 0; i < notas.length; i++) {
    soma += notas[i];
}

let media = soma / notas.length;

console.log("Notas:");

for (let i = 0; i < notas.length; i++) {
    console.log(notas[i]);
}

console.log("Média: " + media);