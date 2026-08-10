package parte2;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        double numero = sc.nextDouble();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        double resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= numero;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
