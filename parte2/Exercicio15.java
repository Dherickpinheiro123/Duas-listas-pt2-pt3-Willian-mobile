package parte2;

public class Exercicio15 {
    public static void main(String[] args) {
        double total = 0;

        for (int dia = 1; dia <= 12; dia++) {
            double deposito = dia * 2;
            total += deposito;
        }

        System.out.printf("Valor total após 12 dias: R$ %.2f%n", total);
    }
}
