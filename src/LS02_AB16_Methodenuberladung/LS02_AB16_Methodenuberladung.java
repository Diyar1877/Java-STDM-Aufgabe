package LS02_AB16_Methodenuberladung;

import java.util.Scanner;

public class LS02_AB16_Methodenuberladung {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wahlen Sie 1,2,3: ");
        double wahl = scanner.nextDouble();

        if(wahl == 1){
            System.out.println("anfagns kapital: ");
            double an = scanner.nextDouble();
            System.out.println("zinssatz: ");
            double zi = scanner.nextDouble();
            System.out.println("anzahl der tage: ");
            double anTa = scanner.nextDouble();
            berechnen(an, zi, anTa);
        } else if (wahl == 2) {
            System.out.println("anfagns kapital: ");
            double an = scanner.nextDouble();
            System.out.println("zinssatz: ");
            double zi = scanner.nextDouble();

            berechnen(an, zi);
        } else if (wahl == 3) {
            System.out.print("Rate: ");
            double r = scanner.nextDouble();
            System.out.print("Zinssatz (%): ");
            double p = scanner.nextDouble();
            System.out.print("Jahre: ");
            int n = scanner.nextInt();

            berechneZinsen(r, p, n, true);

        } else {
            System.out.println("ungultige zahl");
        }

        scanner.close();


    }
    public static void berechnen(double a, double z, double t){
        double zins = (a * z * t) / (100 * 360);
        System.out.println(zins);
    }
    public static void berechnen(double a, double z){
        double zins = a * z / 100;
        System.out.println(zins);
    }
    static void berechneZinsen(double r, double p, int n, boolean sparplan) {
        double kn = r * (Math.pow(1 + p / 100, n) - 1) / (p / 100);
        System.out.println("Endkapital: " + kn);
    }
}
