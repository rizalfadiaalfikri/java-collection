package collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Rizal", "Fadia", "Al", "Fikri"));

        NavigableSet<String> namesReverse = names.descendingSet();

        for (var name : namesReverse) {
            System.out.println(name);
        }

        // Membuat menjadi immutable
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        immutable.add("ZAPPS");

    }
}
