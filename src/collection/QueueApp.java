package collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        // Queue<String> queue = new ArrayDeque<>(10);
        // Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("Rizal");
        queue.add("Fadia");
        queue.add("Al");
        queue.add("Fikri");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());

    }
}
