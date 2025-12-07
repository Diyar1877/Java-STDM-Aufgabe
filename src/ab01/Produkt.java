package ab01;

import java.util.Scanner;

public class Produkt {
    private double zahl1;
    private double zahl2;

    public Produkt(double zahl1, double zahl2){
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }

    public void Multipilzieren(){

        double ergebnis = zahl1 * zahl2;

        System.out.println("das zahl " + zahl1 + " mal das zahl " + zahl2 + " ist gleich " + ergebnis);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geben Sie bitte ersten zahl ein: ");
        double eingabe1 = scanner.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("geben Sie bitte zweiten zahl ein: ");
        double eingabe2 = scanner.nextDouble();
        scanner.close();

        Produkt meinZahl = new Produkt(eingabe1, eingabe2);
        meinZahl.Multipilzieren();

    }
}