package parte2;

public class Exercicio10 {
    public static void main(String[] args) {
        String primeiroNome = "Will";
        String segundoNome = "Lucas";

        for (int i = 1; i <= 6; i++) {
            String temporario = primeiroNome;
            primeiroNome = segundoNome;
            segundoNome = temporario;

            System.out.println("Interação " + i + ":");
            System.out.println("Primeiro nome: " + primeiroNome);
            System.out.println("Segundo nome: " + segundoNome);
        }
    }
}
