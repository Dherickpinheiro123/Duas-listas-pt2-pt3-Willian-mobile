package parte2;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas vezes o eco acontece? ");
        int vezes = sc.nextInt();

        for (int i = 1; i <= vezes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("Olá ");
            }
            System.out.println();
        }

        sc.close();
    }
}
