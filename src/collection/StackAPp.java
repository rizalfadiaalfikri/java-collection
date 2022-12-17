package collection;

import java.util.Stack;

public class StackAPp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Rizal");
        stack.push("Fadia");
        stack.push("Al");
        stack.push("Fikri");

        for (var value = stack.pop(); value != null; value = stack.pop()) {
            System.out.println(value);
        }

    }
}
