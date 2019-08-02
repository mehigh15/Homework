package e_26_07;


import java.util.Objects;

public class Person2 {
    private String name;


    public Person2(String name) {

        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person2)) {
            return false;
        }
        Person2 person = (Person2) o;
        return name.equals(person.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

}
