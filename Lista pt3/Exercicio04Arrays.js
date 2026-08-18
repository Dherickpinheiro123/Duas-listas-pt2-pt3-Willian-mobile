let carros = [
    {
        marca: "Toyota",
        modelos: ["Corolla", "Yaris", "Hilux"]
    },
    {
        marca: "Volkswagen",
        modelos: ["Gol", "Polo", "Virtus"]
    },
    {
        marca: "Chevrolet",
        modelos: ["Onix", "Tracker", "Cruze"]
    },
    {
        marca: "Fiat",
        modelos: ["Argo", "Mobi", "Cronos"]
    }
];

let tabela = document.createElement("table");

tabela.border = "1";

for (let i = 0; i < carros.length; i++) {

    for (let j = 0; j < carros[i].modelos.length; j++) {

        let linha = document.createElement("tr");

        let colunaMarca = document.createElement("td");
        let colunaModelo = document.createElement("td");

        colunaMarca.textContent = carros[i].marca;
        colunaModelo.textContent = carros[i].modelos[j];

        linha.appendChild(colunaMarca);
        linha.appendChild(colunaModelo);

        tabela.appendChild(linha);
    }

    let linhaSeparadora = document.createElement("tr");

    let colunaSeparadora = document.createElement("td");

    colunaSeparadora.colSpan = 2;

    let linha = document.createElement("hr");

    colunaSeparadora.appendChild(linha);

    linhaSeparadora.appendChild(colunaSeparadora);

    tabela.appendChild(linhaSeparadora);
}

document.body.appendChild(tabela);