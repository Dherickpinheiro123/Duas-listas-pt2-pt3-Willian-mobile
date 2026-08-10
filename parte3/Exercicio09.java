package parte3;

import java.util.HashSet;
import java.util.Set;

public class Exercicio09 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11, 12, 3, 14, 15, 16, 7, 18, 19, 20};

        Set<Integer> numerosIguais = new HashSet<>();

        for (int numero1 : array1) {
            for (int numero2 : array2) {
                if (numero1 == numero2) {
                    numerosIguais.add(numero1);
                }
            }
        }

        System.out.println("Números presentes nos dois arrays:");
        for (int numero : numerosIguais) {
            System.out.println(numero);
        }
    }
}
