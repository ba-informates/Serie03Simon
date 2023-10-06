import java.lang.Math;
import static safecollector.SafeCollector.collectSafeInteger;

public class PGCD {

    public static void main(String[] args) {

        int a = collectSafeInteger("Plz enter positive number a:", safecollector.SafeCollector::POSITIVE_INTEGER);
        int b = collectSafeInteger("Plz enter positive number b:", safecollector.SafeCollector::POSITIVE_INTEGER);

        while (Math.abs(a - b) == 0) {
            if (a > b) {
                a = a -b;
            } else {
                b = b - a;
            }
        }

        int pgcd = a;

        System.out.println("PGCD est " + a);

    }

}
