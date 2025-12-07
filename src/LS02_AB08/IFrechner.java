package LS02_AB08;

import java.util.Scanner;

public class IFrechner {
    private double warenwert;
    private double unter5k = 1.5;
    private double zwischen5und9k = 2;
    private double ab10k = 2.5;
    private double endBetrag;
    private double endd;
    public IFrechner(double warenwert){
        this.warenwert = warenwert;
    }
    public void rechnen(){
        if(warenwert <= 5000){
            endBetrag = warenwert * unter5k / 100;
        } else if (warenwert < 9999 || warenwert > 5000 ) {
            endBetrag = warenwert * zwischen5und9k / 100;
        } else{
            endBetrag = warenwert * ab10k / 100;
        }
        endd = endBetrag + warenwert;
    }
    public void ausgabe(){
        System.out.println("ihren betrag betragt " + endBetrag + " dass heisst " + endd);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("geben Sie den Warenwert ein: ");
        double an = scanner.nextDouble();


        IFrechner eins = new IFrechner(an);
        eins.rechnen();
        eins.ausgabe();
    }

}
