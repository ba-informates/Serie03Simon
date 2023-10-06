import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        int delta = fin - debut;

        if ((debut < 0 || debut > 24) || (fin < 0 || fin > 24)) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }

        else if (delta == 0) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        }

        else if (delta < 0) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        }

        else {

            System.out.println("Vous avez loué votre vélo pendant");

            double priceLow = 1.0;
            double priceHigh = 2.0;

            int lowHourCount = 0;
            int highHourCount = 0;
            for (int i = debut; i < fin; i++) {
                if (i >= 7 && i < 17) {
                    highHourCount++;
                } else {
                    lowHourCount++;
                }
            }

            if (lowHourCount > 0) {
                System.out.println(lowHourCount + " heure(s) au tarif horaire de " + priceLow + " franc(s)");
            }
            if (highHourCount > 0) {
                System.out.println(highHourCount + " heure(s) au tarif horaire de " + priceHigh + " franc(s)");
            }

            System.out.print("Le montant total à payer est de ");
            System.out.print(priceHigh * highHourCount + priceLow * lowHourCount);
            System.out.println(" franc(s).");

        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
