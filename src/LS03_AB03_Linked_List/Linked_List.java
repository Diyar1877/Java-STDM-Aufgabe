package LS03_AB03_Linked_List;

import java.util.LinkedList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Linked_List {

    static void main() {
        LinkedList<Double> linkedList = new LinkedList<>();
        String[] stadt = {"Munster", "Berlin", "Koln", "Dusseldorf", "Steinfurt", "Greven", "Roxel", "Dortmound"};
        for (String element: stadt){
            System.out.print(element + ": ");
            Scanner scanner  = new Scanner(System.in);
            double sc = scanner.nextDouble();
            linkedList.add(sc);

        }
        for (Double el : linkedList){
            for (String e: stadt)
            System.out.println( e +": " + el);

        }
        OptionalDouble durchschnit = linkedList.stream().mapToDouble(Double::doubleValue).average();
        System.out.println("durchschnit: " + durchschnit.getAsDouble());

        double min = linkedList.getFirst();
        double max = linkedList.getFirst();

        for (double zahl: linkedList){
            if (zahl < min){
                min = zahl;
            }
            if (zahl > max){
                max = zahl;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
