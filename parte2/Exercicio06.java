package parte2;

public class Exercicio06 {
    public static void main(String[] args) {
        double altura = 145;
        double baseMaior = 120;
        double baseMenor = 75;

        double areaTrapezio = ((baseMaior + baseMenor) / 2) * altura;

        double larguraPalco = 15;
        double alturaPalco = 8.5;
        double areaPalco = larguraPalco * alturaPalco;

        double areaPublico = areaTrapezio - areaPalco;
        int ingressos = (int) (areaPublico * 4);

        System.out.println("Área do trapézio: " + areaTrapezio + " m²");
        System.out.println("Área do palco: " + areaPalco + " m²");
        System.out.println("Área disponível para o público: " + areaPublico + " m²");
        System.out.println("Ingressos que podem ser vendidos: " + ingressos);
    }
}
