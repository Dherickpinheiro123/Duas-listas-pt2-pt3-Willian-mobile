let numero = Number(
    prompt("Digite o número:")
);

let expoente = Number(
    prompt("Digite o expoente:")
);

let resultado = 1;

for (let i = 0; i < expoente; i++) {
    resultado = resultado * numero;
}

console.log("Resultado: " + resultado);