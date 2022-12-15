package collection;

import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        // List<String> names = new LinkedList<>();

        names.add("Rizal");
        names.add("Fadia");
        names.add("Al");
        names.add("Fikri");

        System.out.println(names.get(0));
        System.out.println(names.get(2));
    }
}
