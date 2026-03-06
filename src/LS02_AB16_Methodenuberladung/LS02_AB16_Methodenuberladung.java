package LS02_AB16_Methodenuberladung;

import java.util.Scanner;

public class LS02_AB16_Methodenuberladung {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wahlen Sie 1,2,3: ");
        double wahl = scanner.nextDouble();

        if(wahl == 1){
            System.out.println("anfagns kapital: ");
            double kapital = scanner.nextDouble();
            System.out.println("zinssatz: ");
            double interestRate = scanner.nextDouble();
            System.out.println("anzahl der tage: ");
            double days = scanner.nextDouble();
            System.out.println(berechnen(kapital, interestRate, days));

        } else if (wahl == 2) {
            System.out.println("anfagns kapital: ");
            double an = scanner.nextDouble();
            System.out.println("zinssatz: ");
            double zi = scanner.nextDouble();
            System.out.println(berechnen(an, zi));

        } else if (wahl == 3) {
            System.out.print("Rate: ");
            double r = scanner.nextDouble();
            System.out.print("Zinssatz (%): ");
            double p = scanner.nextDouble();
            System.out.print("Jahre: ");
            int n = scanner.nextInt();

            System.out.println("Endkapital: " + berechneZinsen(r, p, n, true));

        } else {
            System.out.println("ungultige zahl");
        }

        scanner.close();


    }
    public static double berechnen(double kapital, double interestRate, double days){
        return (kapital * interestRate *days) / (100 * 360);
    }
    public static double berechnen(double a, double z){
        return a * z / 100;
    }
    static double berechneZinsen(double r, double p, int n, boolean sparplan) {
        return r * (Math.pow(1 + p / 100, n) - 1) / (p / 100);

    }
}
