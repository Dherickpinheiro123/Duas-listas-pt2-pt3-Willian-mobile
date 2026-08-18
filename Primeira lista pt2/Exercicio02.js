let numero = Number(prompt("Digite um número:"));
let primo = true;

if (numero < 2) {
    primo = false;
}

for (let i = 2; i < numero; i++) {
    if (numero % i === 0) {
        primo = false;
        break;
    }
}

if (primo) {
    console.log("O número é primo.");
} else {
    console.log("O número não é primo.");
}