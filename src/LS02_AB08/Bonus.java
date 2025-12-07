package LS02_AB08;

import java.util.Scanner;

public class Bonus {
        private double jahresUmsatz;
        private double endBonus;
        private double dauerGb;
        private double endBetrag;

        public Bonus(double jahresUmsatz, double dauerGb){
            this.jahresUmsatz = jahresUmsatz;

            this.dauerGb = dauerGb;
        }

        public void rechnen(){
            if (jahresUmsatz < 150000 && dauerGb < 5){
                endBonus = 2;
            } else if (jahresUmsatz < 150000 && dauerGb >= 5) {
                endBonus = 2.5;
            } else if (jahresUmsatz >= 150000 && dauerGb >= 5){
                endBonus = 4;
            } else if (jahresUmsatz >= 150000 && dauerGb < 5){
                endBonus = 3.5;
            }
            endBetrag = jahresUmsatz * endBonus / 100;
        }
        public void ausgabe(){
            System.out.println("Bonus" + endBonus);
            System.out.println("Jahresbonus: " + endBetrag);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("umsatz ");
        double um = scanner.nextDouble();


        System.out.println("dauer ");
        double dauer = scanner.nextDouble();

        scanner.close();
        Bonus eins = new Bonus(um, dauer);
        eins.rechnen();
        eins.ausgabe();
    }
    }
