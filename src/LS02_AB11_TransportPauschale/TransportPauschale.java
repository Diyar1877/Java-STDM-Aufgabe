package LS02_AB11_TransportPauschale;

import java.util.Scanner;

public class TransportPauschale {
    public double warenwert;
    public double enfernung;
    public String TL;
    public double TransportPauschale;
    public double nettoRechnung;
    public double umsatzSteuer;
    public double bruttoRechnung;

    public TransportPauschale(double warenwert, double enfernung, String TL){
        this.warenwert = warenwert;
        this.enfernung = enfernung;
        this.TL = TL;
    }
    public void rechnen(){
        TL = TL.toUpperCase();

        if (TL.equals("L")) {
            System.out.println("Transportart: LKW");

            if (enfernung < 100) {
                TransportPauschale = 75;
            } else if (enfernung < 500) {
                TransportPauschale = 160;
            } else {
                TransportPauschale = 280;
            }

        } else if (TL.equals("T")) {
            System.out.println("Transportart: Transporter");

            if (enfernung < 100) {
                TransportPauschale = 50;
            } else if (enfernung < 500) {
                TransportPauschale = 150;
            } else {
                TransportPauschale = 250;
            }
        }

        System.out.println("Transportkostenpauschale: "+TransportPauschale);

        nettoRechnung = warenwert + TransportPauschale;
        umsatzSteuer = nettoRechnung * 0.19;
        bruttoRechnung = nettoRechnung + umsatzSteuer;

    }
    public void ausgabe(){
        System.out.println("Nettorechnungsbetrag: " + nettoRechnung);
        System.out.println("Umsatzsteuerbetrag: " + umsatzSteuer);
        System.out.println("Bruttorechnungsbetrag: " + bruttoRechnung);

    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Warenwert ein: ");
        double ww = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Geben Sie Entfernung ein: ");
        double en = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Geben Sie die Transport ein (L fur LKW, T fur Transporter): ");
        String lt = scanner.nextLine();

        TransportPauschale eins = new TransportPauschale(ww,en,lt);
        eins.rechnen();
        eins.ausgabe();
    }
}
