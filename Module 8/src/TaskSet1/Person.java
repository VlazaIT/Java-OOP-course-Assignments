package TaskSet1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "San Francisco"));
        people.add(new Person("Charlie", 35, "New York"));
        people.add(new Person("Daisy", 28, "Los Angeles"));

        // Sort by Age
        people.sort(Comparator.comparingInt(Person::getAge));

        // Filter by City
        List<Person> filtered = people.stream()
                .filter(p -> "New York".equals(p.getCity()))
                .collect(Collectors.toList());

        // Print Sorted and Filtered List
        filtered.forEach(System.out::println);
    }
}

