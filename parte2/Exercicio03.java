package parte2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.print("Nome do produto (ou 'sair'): ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Data de vencimento (dd/MM/yyyy): ");
            String dataTexto = sc.nextLine();

            LocalDate vencimento = LocalDate.parse(dataTexto, formato);
            LocalDate hoje = LocalDate.now();

            if (vencimento.isBefore(hoje)) {
                System.out.println(nome + " está vencido.");
            } else {
                System.out.println(nome + " não está vencido.");
            }
        }

        sc.close();
    }
}
