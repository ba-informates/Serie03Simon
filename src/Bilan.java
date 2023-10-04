import java.util.Scanner;

public class Bilan {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Donnez n:");

        final int nbMois = scanner.nextInt();

        int totalSum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 1; i <= nbMois; i++) {

            System.out.println("Donnez le montant du mois " + i + " (Frs):");
            int v = scanner.nextInt();

            totalSum += v;

            if (v < min) {
                min = v;
            }

            if (v > max) {
                max = v;
            }

        }

        int avg = totalSum / nbMois;

        System.out.println("La somme mensuelle moyenne reçue est: " + avg);
        System.out.println("Le montant mensuel minimal reçu est: " + min);
        System.out.println("Le montant mensuel maximal reçu est: " + max);

    }

}
