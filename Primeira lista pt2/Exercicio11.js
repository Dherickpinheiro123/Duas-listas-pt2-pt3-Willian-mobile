let largura = Number(
    prompt("Digite a largura do quadrado:")
);

let altura = Number(
    prompt("Digite a altura do quadrado:")
);

for (let i = 0; i < altura; i++) {

    let linha = "";

    for (let j = 0; j < largura; j++) {
        linha += "* ";
    }

    console.log(linha);
}