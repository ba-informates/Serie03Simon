import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);


        final double g = 9.81;

        double v0 = 0.0;
        double t0 = 0.0;

        double vitesse = v0;
        double hauteur = h0;
        double accel = g;
        double t = t0;

        double s0 = 2;

        boolean vitesseDuSonDepassee = false;
        boolean vitesseMaxDepassee = false;
        boolean parachuteOuvert = false;

        while (hauteur > 0) {

            System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);

            t += 1;

            double s = s0/masse;

            double q = Math.exp(-s * (t - t0));

            vitesse = g/s * (1 - q) + v0 * q;

            if (vitesse > 343 && !vitesseDuSonDepassee) {
                System.out.println("## Felix depasse la vitesse du son");
                vitesseDuSonDepassee = true;
            }

            hauteur = h0 - g/s * (t - t0) - (v0 - g/s)/s * (1 - q);

            accel = g - s * vitesse;

            if (accel < 0.5 && !vitesseMaxDepassee) {
                System.out.println("## Felix a atteint sa vitesse maximale");
                vitesseMaxDepassee = true;
            }

            if (hauteur < 2500 && !parachuteOuvert) {
                s0 = 25;
                t0 = t;
                v0 = vitesse;
                h0 = hauteur;
                System.out.println("## Felix ouvre son parachute");
                parachuteOuvert = true;
            }

        };

        clavier.close();
    }
}
