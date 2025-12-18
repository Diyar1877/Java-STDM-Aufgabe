package LS02_AB12GEWINNanalyse;

import java.util.Scanner;

public class GewinnAnalyse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] gewinne = {"Januar", "Februar", "März", "April", "Mai", "Juni","Juli", "August", "September", "Oktober", "November", "Dezember"};
        double jahresgewinn = 0;

        for (int i = 0; i < gewinne.length; i++) {
            System.out.print(gewinne[i] + ": ");
            String eingabe = scanner.nextLine();

            if (eingabe.trim().isEmpty()) {
                eingabe = "0";
            }

            jahresgewinn += Double.parseDouble(eingabe);
        }


        double durchschnitt = jahresgewinn / 12;
        float a = (float) durchschnitt;

        System.out.println("Jahresgewinn: " + jahresgewinn + " Euro");
        System.out.println("Durchschnittlicher Monatsgewinn: " + durchschnitt + " Euro");
    }
}
