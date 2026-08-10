package parte2;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura em pés: ");
        double pes = sc.nextDouble();

        double metros = pes * 0.3048;

        System.out.printf("%.2f pés = %.2f metros%n", pes, metros);

        sc.close();
    }
}
