package com.learning.core.day5;

import java.util.Objects;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

   

	// Implementing natural sorting using id
   // @override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.id, otherPerson.id);
    }

    // Override toString method
    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id && age == person.age && Double.compare(person.salary, salary) == 0 && Objects.equals(name, person.name);
    }
}


public class D05P07 {

	public static void main(String[] args) {

		 // Creating a TreeSet of Person objects with natural sorting
        TreeSet<Person> personSet = new TreeSet<>();

        // Adding predefined information of 6 person details
        personSet.add(new Person(1, "Jerry", 25, 999.0));
        personSet.add(new Person(2, "Smith", 30, 2999.0));
        personSet.add(new Person(3, "Popeye", 35, 5999.0));
        personSet.add(new Person(4, "Jones", 40, 6999.0));
        personSet.add(new Person(5, "John", 45, 1999.0));
        personSet.add(new Person(6, "Tom", 50, 3999.0));

        // Printing id, name, and salary of each person
        for (Person person : personSet) {
            System.out.println(person);
        }

	}

}
