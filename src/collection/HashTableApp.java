package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("rizal", "rizal");
        map.put("fadia", "fadia");
        map.put("al", "al");
        map.put("fikri", "fikri");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

    }
}
