package parte2;

public class Exercicio04 {
    public static void main(String[] args) {
        double nigeria = 195.9;
        double china = 1393.0;
        double crescimentoNigeria = 0.038;
        double crescimentoChina = 0.0037;
        int anos = 0;

        while (nigeria <= china) {
            nigeria *= (1 + crescimentoNigeria);
            china *= (1 + crescimentoChina);
            anos++;

            System.out.printf("Ano %d - Nigéria: %.2f milhões | China: %.2f milhões%n",
                    anos, nigeria, china);
        }

        System.out.println("Anos necessários: " + anos);
    }
}
