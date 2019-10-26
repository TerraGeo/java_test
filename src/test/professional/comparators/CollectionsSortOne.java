package test.professional.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortOne {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Lazy", 3, "John"));
        dogs.add(new Dog("White", 5, "Henry"));
        dogs.add(new Dog("Blaky", 7, "Bert"));
        dogs.add(new Dog("Tarzan", 1, "Jack"));

        SortOne sortOne = new SortOne();
        Collections.sort(dogs, sortOne);

        System.out.println(dogs);

        Collections.sort(dogs, new SortTwo());

        System.out.println(dogs);

        dogs.sort(new SortOne());

        System.out.println(dogs);
    }

    static class SortOne implements Comparator<Dog> {

        public int compare(Dog o1, Dog o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    static class SortTwo implements Comparator<Dog> {

        public int compare(Dog o1, Dog o2) {
            return o1.owner.compareTo(o2.owner);
        }
    }

}

class Dog {
    String name;
    int age;
    String owner;

    public Dog(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String toString() {
        return owner;
    }
}
