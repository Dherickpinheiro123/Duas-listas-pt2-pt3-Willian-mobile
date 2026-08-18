let inicio = Number(prompt("Digite o início do intervalo:"));
let fim = Number(prompt("Digite o fim do intervalo:"));

console.log("Números ímpares:");

for (let i = inicio; i <= fim; i++) {
    if (i % 2 !== 0) {
        console.log(i);
    }
}