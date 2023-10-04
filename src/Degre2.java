import java.util.Objects;
import java.util.Scanner;
import java.lang.Math;

public class Degre2 {

    private static Scanner scanner = new Scanner(System.in);

    private static Double computeSolution (Double a, Double b, Double delta, Boolean negate) {
        final double newDelta = negate ? -Math.sqrt(delta) : Math.sqrt(delta);
        return (-b + newDelta)/2*a;
    }

    private static void computeAndShowPolynomialSolution (Double a, Double b, Double c) {
        Double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0.0) {
            System.out.println("Unfortunately, there is no solution...");
        } else if (delta == 0.0) {
            Double sol = computeSolution(a, b, delta, false);
            System.out.println("All right, one sol man: " + sol);
        } else {
            Double sol1 = computeSolution(a, b, delta, true);
            Double sol2 = computeSolution(a, b, delta, false);
            System.out.println("Yay, I was able to find two solutions: " + sol1 + ", " + sol2);
        }
    }

    private static Double[] collectSafeValues () {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        while (a == 0.0) {
            System.out.println("Hey, please enter the value for a:");
            a = scanner.nextDouble();
        }

        System.out.println("Got it. Now please enter a value for b:");
        b = scanner.nextDouble();

        System.out.println("Perfect. Now please enter a value for c:");
        c = scanner.nextDouble();

        return new Double[] { a, b, c };
    }

    private static Boolean collectLeave () {
        System.out.println("Leave? y/n");
        while(true) {
            String ans = scanner.nextLine();
            if (Objects.equals(ans, "y")) {
                return true;
            } else if (Objects.equals(ans, "n")){
                return false;
            } else {
                System.out.println("Sorry, wrong input. Leave? y/n");
            }
        }
    }

    public static void main(String[] args) {

        boolean stop = false;

        while (!stop) {
            final Double[] values = collectSafeValues();
            computeAndShowPolynomialSolution(values[0], values[1], values[2]);
            stop = collectLeave();
        }

    }

}