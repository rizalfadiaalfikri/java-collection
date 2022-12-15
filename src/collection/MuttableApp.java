package collection;

import java.util.List;

import collection.data.Person;

public class MuttableApp {
    public static void main(String[] args) {
        Person person = new Person("Rizal");

        person.addHobby("Coding");
        person.addHobby("Play Futsal");

        doSomethingWithHobbies(person.getHobby());

        for (var hobby : person.getHobby()) {
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobbies");
    }
}
