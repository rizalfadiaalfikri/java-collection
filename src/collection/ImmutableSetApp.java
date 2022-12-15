package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> satu = Collections.singleton("Rizal");

        Set<String> mutable = new HashSet<>();
        mutable.add("Rizal");
        mutable.add("Fadia");
        mutable.add("Al");
        mutable.add("Fikri");
        Set<String> immutable = Collections.unmodifiableSet(mutable);
    }
}
