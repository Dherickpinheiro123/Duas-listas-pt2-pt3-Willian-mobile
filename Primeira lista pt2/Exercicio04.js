let nigeria = 195.9;
let china = 1393.0;

let crescimentoNigeria = 0.038;
let crescimentoChina = 0.0037;

let anos = 0;

while (nigeria <= china) {

    nigeria = nigeria + (nigeria * crescimentoNigeria);
    china = china + (china * crescimentoChina);

    anos++;

    console.log(
        "Ano " + anos +
        " - Nigéria: " + nigeria.toFixed(2) +
        " milhões | China: " + china.toFixed(2) +
        " milhões"
    );
}

console.log("Quantidade de anos necessários: " + anos);