package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Rizal");
        names.add("Fadia");
        names.add("Al");
        names.add("Fikri");
        names.addAll(List.of("ZAPPS", "INDONESIA"));

        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("===============");
        System.out.println("REMOVE DATA");
        System.out.println("===============");

        names.remove("Rizal");
        names.removeAll(List.of("ZAPPS", "INDONESIA"));

        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("===============");
        System.out.println("CEK DATA");
        System.out.println("===============");

        System.out.println("Rizal: " + names.contains("Rizal"));
        System.out.println("Fadia: " + names.contains("Fadia"));
        System.out.println("Al Fikri: " + names.containsAll(List.of("Al", "Fikri")));

    }
}
