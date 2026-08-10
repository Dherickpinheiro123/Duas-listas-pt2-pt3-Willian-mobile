package parte3;

public class Exercicio03 {
    public static void main(String[] args) {
        int[] impares = new int[100];
        int posicao = 0;

        for (int i = 1; i <= 200; i += 2) {
            impares[posicao] = i;
            posicao++;
        }

        for (int numero : impares) {
            System.out.println(numero);
        }
    }
}
