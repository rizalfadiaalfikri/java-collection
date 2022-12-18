package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Rizal", "Rizal");
        map.put("Fadia", "Fadia");
        map.put("Al", "Al");
        map.put("Fikri", "Fikri");

        map.forEach(new BiConsumer<String, String>() {

            @Override
            public void accept(String key, String value) {
                // TODO Auto-generated method stub
                System.out.println(key + " " + value);

            }

        });

    }
}
