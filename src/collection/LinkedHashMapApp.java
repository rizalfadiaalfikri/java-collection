package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Rizal");
        map.put("last", "Fikri");
        map.put("middle", "Fadia Al");

        Set<String> keys = map.keySet();
        for (var key : keys) {
            System.out.println(key);
        }

    }
}
