while (true) {

    let nomeProduto = prompt(
        "Digite o nome do produto ou 'sair' para encerrar:"
    );

    if (nomeProduto.toLowerCase() === "sair") {
        break;
    }

    let dataVencimento = prompt(
        "Digite a data de vencimento (DD/MM/AAAA):"
    );

    let partes = dataVencimento.split("/");

    let dia = Number(partes[0]);
    let mes = Number(partes[1]) - 1;
    let ano = Number(partes[2]);

    let vencimento = new Date(ano, mes, dia);
    let hoje = new Date();

    if (vencimento < hoje) {
        console.log(nomeProduto + " está vencido.");
    } else {
        console.log(nomeProduto + " não está vencido.");
    }
}