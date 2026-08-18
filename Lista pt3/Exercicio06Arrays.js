let limpeza = [
    "Detergente",
    "Sabão",
    "Desinfetante",
    "Esponja",
    "Água sanitária"
];

let alimentacao = [
    "Arroz",
    "Feijão",
    "Macarrão",
    "Leite",
    "Pão"
];

let tabela = document.createElement("table");

tabela.border = "1";

let cabecalho = document.createElement("tr");

let colunaLimpeza = document.createElement("th");
let colunaAlimentacao = document.createElement("th");

colunaLimpeza.textContent = "Limpeza";
colunaAlimentacao.textContent = "Alimentação";

cabecalho.appendChild(colunaLimpeza);
cabecalho.appendChild(colunaAlimentacao);

tabela.appendChild(cabecalho);

for (let i = 0; i < 5; i++) {

    let linha = document.createElement("tr");

    let itemLimpeza = document.createElement("td");
    let itemAlimentacao = document.createElement("td");

    itemLimpeza.textContent = limpeza[i];
    itemAlimentacao.textContent = alimentacao[i];

    linha.appendChild(itemLimpeza);
    linha.appendChild(itemAlimentacao);

    tabela.appendChild(linha);
}

document.body.appendChild(tabela);