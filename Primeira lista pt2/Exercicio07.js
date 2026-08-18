let pes = Number(
    prompt("Digite a altura em pés:")
);

let metros = pes * 0.3048;

console.log(
    pes + " pés equivalem a " +
    metros.toFixed(2) +
    " metros."
);