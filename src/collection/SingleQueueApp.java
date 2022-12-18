package collection;

import java.util.Queue;

import collection.collection.SingleQueue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());

        System.out.println(queue.offer("Rizal"));
        System.out.println(queue.offer("Fadia"));
        System.out.println(queue.offer("Al"));
        System.out.println(queue.offer("Fikri"));

        System.out.println(queue.size());

    }
}
