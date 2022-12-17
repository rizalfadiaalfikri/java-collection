package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Rizal");
        myList.add("Fadia");
        myList.add("Al");
        myList.add("Fikri");

        Collections.sort(myList);

        for (var value : myList) {
            System.out.println(value);
        }

    }
}
