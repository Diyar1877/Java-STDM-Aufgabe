package LS02_AB06_Speicherbedarf;

import java.util.Scanner;

public class Speicherbedarf {
    private double bildhohe;
    private double bildbereite;
    private double ppi;
    private double anzahl;
    private double gesamtAnzahlPixel;
    private double toGB;

    public Speicherbedarf(double bildhohe, double bildbereite, double ppi, double anzahl){
        this.bildhohe = bildhohe;
        this.bildbereite = bildbereite;
        this.ppi = ppi;
        this.anzahl = anzahl;
    }

    //rechnen methode
    public void rechnen(){

        gesamtAnzahlPixel = (bildhohe * ( ppi / 2.54 ))  * ( bildbereite * ( ppi / 2.54 ) ) * anzahl;
        long gesamtByte = (long) (gesamtAnzahlPixel * 6);

        toGB = (double) gesamtByte / 1000000000;
    }
    public void ausgabe(){
        System.out.println("Fur die Speicherung von " + anzahl + " benorigen Sie: " + toGB + " GB");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Bildhöhe in cm ein: ");
        double hohe = scanner.nextDouble();

        System.out.print("Geben Sie die Bildbreite in cm ein: ");
        double bereite = scanner.nextDouble();

        System.out.print("Geben Sie die Auflösung in ppi ein: ");
        double pi = scanner.nextDouble();

        System.out.print("Geben Sie die Anzahl der zu speichernden Bilder ein: ");
        double anz = scanner.nextDouble();

        Speicherbedarf eins = new Speicherbedarf(hohe, bereite, pi, anz);
        eins.rechnen();
        eins.ausgabe();

    }
}