package safecollector;
import java.util.Scanner;

public class SafeCollector {

    private final static Scanner scanner = new Scanner(System.in);

    public static boolean POSITIVE_INTEGER (int x) {
        return x >= 0;
    }

    public static boolean DOUBLE_BETWEEN_ZERO_ONE (double x) {
        return x >= 0 && x < 1;
    }


    public static int collectSafeInteger (String question, IntegerValidatorFunction func) {

        System.out.println(question);

        while (true) {
            try {
                int value = scanner.nextInt();
                boolean validated = func.apply(value);
                if (!validated) {
                    throw new Exception("does not match criteria");
                }
                return value;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Sorry, plz correct your input value.");
                System.out.println(question);
            }
        }

    }

    public static double collectSafeDouble (String question, DoubleValidatorFunction func) {

        System.out.println(question);

        while (true) {
            try {
                double value = scanner.nextDouble();
                boolean validated = func.apply(value);
                if (!validated) {
                    throw new Exception("does not match criteria");
                }
                return value;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Sorry, plz correct your input value.");
                System.out.println(question);
            }
        }

    }
}
