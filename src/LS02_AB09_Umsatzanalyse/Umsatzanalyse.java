package LS02_AB09_Umsatzanalyse;

import java.util.Scanner;

public class Umsatzanalyse {
    private double umsatzZerlose;
    private double kosten;
    private double toGetGewinn;
    private double branchwert;
    private double umsatzRentabilitat;

    public Umsatzanalyse(double umsatzZerlose, double kosten, double branchwert){
        this.umsatzZerlose = umsatzZerlose;
        this.kosten = kosten;
        this.branchwert = branchwert;
    }

    public void rechnen(){
        toGetGewinn = umsatzZerlose - kosten;
        umsatzRentabilitat = toGetGewinn / umsatzZerlose * 100;


    }
    public void ausgabe(){
        System.out.println("Gewinn: " + toGetGewinn);
        System.out.println("umsatzrenatbiltat: "+umsatzRentabilitat);
        if (umsatzRentabilitat > branchwert){
            System.out.println("Die Umsatzrentabilität liegt über dem Branchenwert.");
        } else if (umsatzRentabilitat < branchwert) {
            System.out.println("Die Umsatzrentabilität liegt unter dem Branchenwert.");
        } else {
            System.out.println("Die Umsatzrentabilität entspricht dem Branchenwert.");
        }
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Umsatzanalyse der HyperBank AG");
        System.out.println("--------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie umsatzZerlose ein: ");
        double umsatz = scanner.nextDouble();

        System.out.print("geben Sie kosten ein: ");
        double kosten = scanner.nextDouble();

        System.out.print("Branchen-Umsatzrentabilitat: ");
        double branchwert = scanner.nextDouble();

        Umsatzanalyse eins = new Umsatzanalyse(umsatz,kosten, branchwert);
        eins.rechnen();
        eins.ausgabe();
    }
}
