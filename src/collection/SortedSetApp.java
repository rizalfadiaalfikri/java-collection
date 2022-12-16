package collection;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import collection.data.Person;
import collection.data.PersonComparator;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Rizal"));
        people.add(new Person("Fadia"));
        people.add(new Person("Al"));
        people.add(new Person("Fikri"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        // immutable
        SortedSet<Person> sortedset = Collections.unmodifiableSortedSet(people);

        sortedset.add(new Person("ZAPPS"));
    }
}
