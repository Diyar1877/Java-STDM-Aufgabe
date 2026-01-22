package LS02_AB13_Zinssatz;

import java.util.Scanner;

public class Zinssatz {

    private double anlageBertrag;
    private double zinsSatz;
    private double laufZeit;

    public Zinssatz(double anlageBertrag, double zinsSatz, double laufZeit){
        this.anlageBertrag = anlageBertrag;
        this.zinsSatz = zinsSatz;
        this.laufZeit = laufZeit;
    }

    public void berechnen(){
        for (int i = 1; i <= laufZeit; i++){
            double zinsen = anlageBertrag * zinsSatz / 100;
            anlageBertrag += zinsen;
            System.out.printf("Jahr %d: %.2f €%n", i, anlageBertrag);
        }
    }
    public void ausgabe(){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Analgebetrag: ");
        double ab = scanner.nextDouble();

        System.out.print("Zinssatz: ");
        double zs = scanner.nextDouble();

        System.out.print("Laufzeit: ");
        double lz = scanner.nextDouble();

        Zinssatz eins = new Zinssatz(ab, zs, lz);
        eins.berechnen();
    }

}
