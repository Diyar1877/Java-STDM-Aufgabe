package LS02_AB04;

import java.util.Scanner;

public class Zinsrechner {
    private double anlagebetrag;
    private double zinssatz;
    private double anlagedauer;
    private double zinsbetrag;

    public Zinsrechner(double anlagebetrag, double zinssatz, double anlagedauer){
        this.anlagebetrag = anlagebetrag;
        this.zinssatz = zinssatz;
        this.anlagedauer = anlagedauer;
    }

    public void rechnen(){
        zinsbetrag = anlagebetrag * zinssatz * anlagedauer / ( 100 * 360 );
        double endbetrag = zinsbetrag + anlagebetrag;

        System.out.println("zinsbetrag : " + zinsbetrag);
        System.out.println("endbetrag : " + endbetrag);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anlage betrag: ");
        double an = sc.nextDouble();

        System.out.println("Sinzsatz");
        double zi = sc.nextDouble();

        System.out.println("dauer");
        double dau = sc.nextDouble();

        Zinsrechner h = new Zinsrechner(an, zi, dau);
        h.rechnen();


    }

}
