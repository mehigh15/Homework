package e_26_07;

import java.util.*;


public class PeopleHashMap {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        List<Address> addresses1 = new ArrayList<>();
        Address a1 = new Address("Russia");
        Address a2 = new Address("United Kingdom");
        addresses.add(a1);
        addresses1.add(a2);

        List<Hobby> hobbies = new ArrayList<>();
        List<Hobby> hobbies1 = new ArrayList<>();

        Hobby h = new Hobby("Riding", 2, addresses);
        Hobby h1 = new Hobby("Swimming", 3, addresses1);
        Hobby h2 = new Hobby("Cycling", 1, addresses);
        hobbies.add(h);
        hobbies1.add(h1);
        hobbies.add(h2);


        Person2 p = new Person2("Sophie");
        Person2 p1 = new Person2("June");
        Person2 p2 = new Person2("Sophie");


        Map<Person2, List<Hobby>> people = new HashMap<>();
        people.put(p, hobbies);
        people.put(p1, hobbies1);
        people.put(p2, hobbies);



        for (Map.Entry m : people.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}
