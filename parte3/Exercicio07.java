package parte3;

public class Exercicio07 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};

        System.out.println("Ordem decrescente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
