package collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);

        map.put(Level.FREE, "Rizal");
        map.put(Level.VIP, "Fikri");

        for (var key : map.entrySet()) {
            System.out.println("Key: " + key.getKey() + " " + "Value: " + key.getValue());
        }

    }
}
