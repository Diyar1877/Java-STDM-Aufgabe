package LS03_AB04_Umsatzanalyse_Hash_Map;

import java.util.HashMap;
import java.util.Scanner;

public class LS03_AB04_Umsatzanalyse_Hash_Map {
    public static void main(String[] args)
    {
        HashMap<String, Integer> umsatzbuch = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anzahl der Stadte: ");
        int anzahl = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < anzahl; i++){
            System.out.print("Stadt: ");
            String stadt = scanner.nextLine();

            System.out.print("Umsatz: ");
            int umsatz = scanner.nextInt();
            scanner.nextLine();

            umsatzbuch.put(stadt , umsatz);
        }
        for (String name: umsatzbuch.keySet()) {
            System.out.println(name + " : " + umsatzbuch.get(name));        }

    }
}
