package parte2;

public class Exercicio17 {
    public static void main(String[] args) {
        int tempoTotal = 0;

        for (int degrau = 1; degrau <= 20; degrau++) {
            tempoTotal += 3;
            System.out.println("Degrau " + degrau + ": " + tempoTotal + " segundos");
        }
    }
}
