let total = 0;
let deposito = 2;

for (let dia = 1; dia <= 12; dia++) {

    total = total + deposito;

    deposito = deposito + 2;
}

console.log(
    "Valor total acumulado: R$ " +
    total.toFixed(2)
);