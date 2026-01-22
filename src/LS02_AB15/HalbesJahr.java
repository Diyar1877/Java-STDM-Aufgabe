package LS02_AB15;

import java.util.Scanner;

public class HalbesJahr {


    static double berechneGesamtErlose(double[] erlose){
        double erloseSumme = 0;
        for (double e: erlose){
            erloseSumme += e;
        }
        return erloseSumme;
    }
    static double berechneGesamtKosten(double[] kosten){
        double kostenSumme = 0;

        for (double k : kosten){
            kostenSumme += k;
        }
        return kostenSumme;
    }
    static double berechnenGesamtGewinn(double kosten, double erlose){
        double gesamtGewinn = 0;
        gesamtGewinn =  erlose - kosten ;
        return gesamtGewinn;
    }
    static double berechnenDurchschnitt(double gesamtGewinn){
        double gesamtDurchschnitt = 0;
        gesamtDurchschnitt = gesamtGewinn / 6;
        return gesamtDurchschnitt;
    }

    static double berechneWirtschaftlichkeit(double erloese, double kosten) {
        return erloese / kosten;
    }

    static double berechneUmsatzrentabilitaet(double gewinn, double erloese) {
        return (gewinn / erloese) * 100;
    }




    static void ausgabe(
            double kosten,
            double erlose,
            double gewinn,
            double durchschnitt,
            double wirtschaftlichkeit,
            double rentabilitat
    ){
        System.out.println("gesamt kosten " + kosten);
        System.out.println("gesamt erlose " + erlose);
        System.out.println("gesamt Gewinn " + gewinn);
        System.out.println("gesamt Durchschnitt " + durchschnitt);
        System.out.printf("Wirtschaftlichkeit: %.2f%n", wirtschaftlichkeit);
        System.out.printf("Umsatzrentabilität: %.2f %% %n", rentabilitat);
    }

    static void main() {
        double[] kosten = new double[6];
        double[] erlose = new double[6];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < kosten.length; i++){
            System.out.println("Kosten Monat " + (i + 1) +  ": ");
            kosten[i] = scanner.nextDouble();
        }

        System.out.println("bitte geben Sie die Umsatzerlose der einzelnen Monate an: ");

        for (int i = 0; i < erlose.length; i++){
            System.out.println("Erlose monat " + (i + 1) + ": ");
            erlose[i] = scanner.nextDouble();
        }

        // unsere methode futtern und die methode soll uns
        // die werte berechenn und in den folgendne variablen tun zb gesamtkosten, gesamtErlose
        double gesamtkosten = berechneGesamtKosten(kosten);
        double gesamtErlose = berechneGesamtErlose(erlose);
        double gesamtGewinn = berechnenGesamtGewinn(gesamtkosten, gesamtErlose);
        double monatDurchschnitt = berechnenDurchschnitt(gesamtGewinn);
        double wirtschaftlichkeit = berechneWirtschaftlichkeit(gesamtErlose, gesamtkosten);
        double umsatzRentabilitat = berechneUmsatzrentabilitaet(gesamtGewinn, gesamtErlose);
        // hier rufen wir die ausgabe methode auf und geben das wert was uns die
        // andere methode berechnet haben und wir in gesamtkosten, gesamterlose gespeichert haben.
        ausgabe(
                gesamtkosten,
                gesamtErlose,
                gesamtGewinn,
                monatDurchschnitt,
                wirtschaftlichkeit,
                umsatzRentabilitat
        );

    }
}
