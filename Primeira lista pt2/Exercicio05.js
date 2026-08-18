let carro1 = 10;
let carro2 = 20;

let volta = 0;

while (carro1 <= carro2) {

    volta++;

    carro1 = carro1 + 3;
    carro2 = carro2 + 1.5;

    console.log(
        "Volta " + volta +
        " - Carro 1: " + carro1 + " km/h" +
        " | Carro 2: " + carro2 + " km/h"
    );
}

console.log("Total de voltas: " + volta);