package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImuttableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();
        List<String> muttable = new ArrayList<>();
        muttable.add("Rizal");
        muttable.add("Fadia");
        List<String> immutable = Collections.unmodifiableList(muttable);
        List<String> elements = List.of("Rizal", "Fadia", "Al", "Fikri");
        // elements.add("Budi");
    }
}
