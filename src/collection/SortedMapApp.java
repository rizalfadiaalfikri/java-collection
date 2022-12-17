package collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("rizal", "rizal");
        sortedMap.put("fadia", "fadia");
        sortedMap.put("al", "al");
        sortedMap.put("fikri", "fikri");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

    }
}
