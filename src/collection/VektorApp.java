package collection;

import java.util.List;
import java.util.Vector;

public class VektorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();

        list.add("Rizal");
        list.add("Fadia");
        list.add("Al");
        list.add("Fikri");

        for (var value : list) {
            System.out.println(value);
        }

    }
}
