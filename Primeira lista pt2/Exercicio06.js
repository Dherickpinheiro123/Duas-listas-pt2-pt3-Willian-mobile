let altura = 145;
let baseMaior = 120;
let baseMenor = 75;

let areaTrapezio =
    ((baseMaior + baseMenor) / 2) * altura;

let larguraPalco = 15;
let alturaPalco = 8.5;

let areaPalco =
    larguraPalco * alturaPalco;

let areaPublico =
    areaTrapezio - areaPalco;

let ingressos =
    areaPublico * 4;

console.log("Área do trapézio: " + areaTrapezio + " m²");
console.log("Área do palco: " + areaPalco + " m²");
console.log("Área disponível para o público: " + areaPublico + " m²");
console.log("Quantidade de ingressos: " + Math.floor(ingressos));