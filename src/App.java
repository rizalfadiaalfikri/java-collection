import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Iterable<String> names = List.of("Rizal", "Fadia", "Al", "Fikri");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
