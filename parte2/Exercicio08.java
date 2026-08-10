package parte2;

public class Exercicio08 {
    public static void main(String[] args) {
        double valorVendido = 360;
        double percentual = 0.80;

        double valorOriginal = valorVendido / percentual;
        double valorComLucro = valorOriginal * 1.20;

        System.out.printf("Valor original: R$ %.2f%n", valorOriginal);
        System.out.printf("Valor para ter 20%% de lucro: R$ %.2f%n", valorComLucro);
    }
}
