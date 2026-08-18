let primeiroNome = "Will";
let segundoNome = "Lucas";

for (let i = 1; i <= 6; i++) {

    let temporario = primeiroNome;

    primeiroNome = segundoNome;
    segundoNome = temporario;

    console.log("Interação " + i);
    console.log("Primeiro nome: " + primeiroNome);
    console.log("Segundo nome: " + segundoNome);
    console.log("--------------------");
}