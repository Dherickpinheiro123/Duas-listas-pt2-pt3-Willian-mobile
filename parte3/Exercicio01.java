package parte3;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] times = new String[10];

        for (int i = 0; i < times.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º time: ");
            times[i] = sc.nextLine();
        }

        System.out.println("\nTimes cadastrados:");
        for (String time : times) {
            System.out.println(time);
        }

        sc.close();
    }
}
