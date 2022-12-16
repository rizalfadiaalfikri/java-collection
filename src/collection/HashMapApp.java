package collection;

import java.util.HashMap;

public class HashMapApp {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("name.first", "Rizal");
        map.put("name.middle", "Fadia Al");
        map.put("name.last", "Fikri");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));

    }
}
