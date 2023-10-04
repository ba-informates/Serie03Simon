import static safecollector.SafeCollector.collectSafeInteger;
import static safecollector.SafeCollector.collectSafeDouble;

import java.lang.Math;

public class Rebonds1 {

    public static void main(String[] args) {

        int Hi = collectSafeInteger("Quelle est la hauteur initiale ?", safecollector.SafeCollector::POSITIVE_INTEGER);
        double eps = collectSafeDouble("Quel est le coefficient de rebond ?", safecollector.SafeCollector::DOUBLE_BETWEEN_ZERO_ONE);
        int rebonds = collectSafeInteger("Combien de rebonds ?", safecollector.SafeCollector::POSITIVE_INTEGER);

        final double g = 9.81;

        double lastH = Hi;
        for (int i = 0; i < rebonds; i++) {
            double v = Math.sqrt(2*g*lastH);
            double v1 = eps * v;
            lastH = Math.pow(v1, 2)/(2*g);
        }

        System.out.println("Dernière hauteur: " + lastH);

    }
}
