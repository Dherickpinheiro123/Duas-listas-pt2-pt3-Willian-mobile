package parte2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        int largura = sc.nextInt();
        System.out.print("Digite a altura: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
