package LS02_AB17_Boolsche_Variable;

import java.util.Scanner;

public class Boolsche_Variable {


    static double rechnenZinsFaktor(double zinsatz){
        return zinsatz / 100 + 1;
    }
    static double rechnenHoch (double faktorr, double jahrlicheBetrag){
        return Math.pow(faktorr , jahrlicheBetrag);
    }
    static double vorschuss(double jahrlicheBetrag, double faktorr, double hoch ){
        return jahrlicheBetrag * faktorr * (hoch - 1) / (faktorr - 1);
    }
    static double nachschuss(double jahrlicheBetrag, double hoch, double faktorr){
        return jahrlicheBetrag * (hoch - 1) / (faktorr - 1);
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("jahrilciher");
        double jahrlicheBetrag = scanner.nextDouble();

        System.out.println("sinzsatz");
        double zins = scanner.nextDouble();

        System.out.println("zeitraum ");
        double zeit = scanner.nextDouble();

        double faktorr = rechnenZinsFaktor(zins);

        double hoch = rechnenHoch(faktorr, zeit);

        double RnV = vorschuss(jahrlicheBetrag, faktorr, hoch);
        System.out.println("vorschuss: " + (String.format("%.2f", RnV) + "€"));

        double RnN = nachschuss(jahrlicheBetrag, hoch, faktorr);
        System.out.println("nachschuss: " + (String.format("%.2f", RnN) + "€"));



    }
}
