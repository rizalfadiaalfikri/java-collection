package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.offerFirst("Rizal");
        deque.offerFirst("Fadia");
        deque.offerFirst("Al");
        deque.offerFirst("Fikri");

        for (var value : deque) {
            System.out.println(value);
        }

        // Mengambil Data
        System.out.println("===============");
        System.out.println(deque.pollLast());

    }
}
