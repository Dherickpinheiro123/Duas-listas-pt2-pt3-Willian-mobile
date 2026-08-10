package parte2;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o início do intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Informe o fim do intervalo: ");
        int fim = sc.nextInt();

        System.out.println("Números ímpares:");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
