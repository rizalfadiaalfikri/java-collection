package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Rizal");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Rizal");
        Map<String, String> imutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Rizal",
                "middle", "Fadia Al",
                "last", "Fikri");

        map.put("a", "A");

    }
}
