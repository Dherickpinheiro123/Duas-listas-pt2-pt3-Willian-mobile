package parte3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exercicio08 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 20, 40, 50, 10, 60, 70, 30};

        Set<Integer> semRepetidos = new LinkedHashSet<>();

        for (int numero : numeros) {
            semRepetidos.add(numero);
        }

        System.out.println("Valores sem repetição:");
        for (int numero : semRepetidos) {
            System.out.println(numero);
        }
    }
}
