package parte2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        boolean primo = numero >= 2;

        for (int i = 2; i <= Math.sqrt(numero) && primo; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

        sc.close();
    }
}
