package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        // jika kita memakai HasSet maka data tidak aakn terurut
        // Set<String> names = new HashSet<>();

        // Jika kita memakai LinkedHasSet maka data akan tetap terurut
        Set<String> names = new LinkedHashSet<>();

        names.add("Rizal");
        names.add("Fadia");
        names.add("Al");
        names.add("Fikri");

        for (var name : names) {
            System.out.println(name);
        }

    }
}
