package parte3;

public class Exercicio04 {
    public static void main(String[] args) {
        String[][] carros = {
            {"Volkswagen", "Gol", "Polo", "Virtus"},
            {"Chevrolet", "Onix", "Tracker", "Cruze"},
            {"Fiat", "Argo", "Mobi", "Cronos"},
            {"Toyota", "Corolla", "Yaris", "Hilux"}
        };

        System.out.println("MARCA | MODELO");
        System.out.println("----------------");

        for (String[] marca : carros) {
            for (int i = 1; i < marca.length; i++) {
                System.out.println(marca[0] + " | " + marca[i]);
            }
            System.out.println("----------------");
        }
    }
}
