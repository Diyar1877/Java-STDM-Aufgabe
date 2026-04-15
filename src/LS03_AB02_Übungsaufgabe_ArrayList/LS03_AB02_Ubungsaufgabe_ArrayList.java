package LS03_AB02_Übungsaufgabe_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class LS03_AB02_Ubungsaufgabe_ArrayList {
    static void main() {
        ArrayList<String> namen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean lauft = true;
        while (lauft){
            System.out.println("1: Namen hinzufügen");
            System.out.println("2: Namen entfernen");
            System.out.println("3: Namen anzeigen");
            System.out.println("4: Beenden");
            System.out.print("Auswahl: ");
            int auswahl = scanner.nextInt();
            scanner.nextLine(); // Puffer leeren (SEHR wichtig!)
            switch (auswahl){
                case 1:
                    System.out.print("Name eingeben: ");
                    String name = scanner.nextLine();
                    namen.add(name);
                    System.out.println("Name wurde hinzugefügt.");
                    break;

                case 2:
                    System.out.print("Name zum Entfernen eingeben: ");
                    String zuEntfernen = scanner.nextLine();

                    if (namen.contains(zuEntfernen)) {
                        namen.remove(zuEntfernen);
                        System.out.println("Name wurde entfernt.");
                    } else {
                        System.out.println("Name nicht gefunden!");
                    }
                    break;

                case 3:
                    System.out.println(namen);
                    break;
                case 4:
                    lauft = false;
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
            }
        }
        scanner.close();
    }
}
