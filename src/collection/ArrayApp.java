package collection;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> name = List.of("Rizal", "Fadia", "Al", "Fikri");

        Object[] objects = name.toArray();
        final String[] strings = name.toArray(new String[] {});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));

    }
}
