package LS02_AB03;

import java.util.Scanner;

public class Rabbatrechner {
    //Attribute es muss immer oben deklariet werden
    private double warenwert;
    private double rabattsatz;
    private double rabattbetrag;
    private double netto;
    private double steuer = 19;
    private double umsatzsteuer;
    private double brutto;

    public Rabbatrechner(double warenwert, double rabattsatz){
        this.warenwert = warenwert;
        this.rabattsatz = rabattsatz;
    }

    // eine methode um die sachen zu berechnen und von andere methode anzeigen lassen

    public void berechnen(){
        rabattbetrag = warenwert * (rabattsatz / 100);
        netto = warenwert - rabattbetrag;
        umsatzsteuer = netto * (steuer / 100);
        brutto = umsatzsteuer + netto;
    }
    // eine methode um die sachen auszugeben i
    public void ausgeben(){
        System.out.printf("%n");
        System.out.println("Warenwert: " + warenwert);
        System.out.println("Rabbattsatz: " + rabattsatz + "%");
        System.out.println("Rabattbetrag: " + rabattbetrag);
        System.out.println("Nettoberechnungsbetrag: " + netto);
        System.out.println("Steuerrechnungsbetrag: " + umsatzsteuer);
        System.out.println("Bruttorechnungsbetrag: " + brutto);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie den Warenwert ein: ");
        double w = sc.nextDouble();

        System.out.print("Geben Sie den Rabattsatz ein: ");
        double r = sc.nextDouble();

        Rabbatrechner rr = new Rabbatrechner(w , r);
        rr.berechnen();
        rr.ausgeben();


    }


}
