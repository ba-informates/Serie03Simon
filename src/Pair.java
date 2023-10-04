import java.util.Scanner;

public class Pair {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entrez un nb entier:");

        int nb = scanner.nextInt();

        String positif = nb > 0 ? "positif" : (nb < 0 ? "négatif" : "zéro");
        String pair = nb % 2 == 0 ? "pair" : "impair";

        System.out.println(positif + " " + pair);

    }

}
