package parte2;

public class Exercicio05 {
    public static void main(String[] args) {
        double carro1 = 10;
        double carro2 = 20;
        int volta = 0;

        while (carro1 <= carro2) {
            volta++;
            carro1 += 3;
            carro2 += 1.5;

            System.out.printf("Volta %d - Carro 1: %.1f km/h | Carro 2: %.1f km/h%n",
                    volta, carro1, carro2);
        }

        System.out.println("Total de voltas: " + volta);
    }
}
