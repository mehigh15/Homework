package e_26_07;


import e_26_07.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class PeopleTreeSet {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        people.add(new Person("Eve", 28));
        people.add(new Person("Sophie", 40));
        people.add(new Person("Eve", 29));
        people.add(new Person("Eve", 28));
        people.add(new Person("Annabelle", 31));

        for(Person person : people){
            System.out.println(person);
        }



    }
}
