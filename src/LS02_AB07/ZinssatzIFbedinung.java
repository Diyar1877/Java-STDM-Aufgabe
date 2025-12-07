package LS02_AB07;

import java.util.Scanner;

public class ZinssatzIFbedinung {
    private double anglagebetrag;
    private double zinssatzUnter = 2.5;
    private double zinssatzUber = 2.75;
    private double endbetrag;
    public ZinssatzIFbedinung(double anglagebetrag){
        this.anglagebetrag = anglagebetrag;
    }

    public void rechnen(){
        if (anglagebetrag > 5000){
            endbetrag = anglagebetrag * zinssatzUber / 100;
        } else if (anglagebetrag < 5000) {
            endbetrag = anglagebetrag * zinssatzUnter / 100;

        }
    }
    public void ausgabe(){
        System.out.println("ihren zins betrag ist " + endbetrag );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ihren betrag an: ");
        double an = scanner.nextDouble();

        scanner.close();

        ZinssatzIFbedinung eins = new ZinssatzIFbedinung(an);
        eins.rechnen();
        eins.ausgabe();
    }
}
