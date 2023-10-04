import java.util.Scanner;

public class Intervalle {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Plz enter a real number:");

        double x = scanner.nextDouble();
        boolean isIncluded = isIncludedInI(x);

        String response = "x " + (isIncluded ? "appartient" : "n'appartient pas") + " à I";

        System.out.println(response);

    }

    private static boolean isIncludedInI(Double x) {

        boolean isIncluded = false;

        if ((2 < x || x == 2) && x < 3) {
            isIncluded = true;
        }

        else if (0 < x && (x < 1 || x == 1)) {
            isIncluded = true;
        }

        else if ((-10 < x || x == -10) && (x < -2 || x == -2)) {
            isIncluded = true;
        }

        return isIncluded;

    }

}
