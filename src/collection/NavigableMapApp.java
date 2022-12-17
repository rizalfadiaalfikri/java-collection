package collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("rizal", "rizal");
        map.put("fadia", "fadia");
        map.put("al", "al");
        map.put("fikri", "fikri");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("rizal"));
        System.out.println(map.higherKey("rizal"));

        // membuat immutable navigable map

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);

        immutable.put("asa", "Sa");
    }
}
