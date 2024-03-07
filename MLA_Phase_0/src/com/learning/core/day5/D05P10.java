package com.learning.core.day5;

import java.util.Comparator;
import java.util.TreeSet;

class Person5 implements Comparable<Person5> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person5(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person5 person = (Person5) obj;
        return id == person.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Person5 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P10 {
    public static void main(String[] args) {
        TreeSet<Person5> persons = new TreeSet<>(Comparator.comparingInt(p -> p.getName().charAt(0)));
        persons.add(new Person5(1, "Smith", 32, 999.0));
        persons.add(new Person5(2, "Tom", 42, 2999.0));
        persons.add(new Person5(3, "Popeye", 52, 5999.0));
        persons.add(new Person5(4, "Jones", 22, 6999.0));
        persons.add(new Person5(5, "Jerry", 22, 1999.0));
        persons.add(new Person5(6, "Tom", 32, 3999.0));

        Person5 firstPersonWithNameStartingWithJ = persons.first();
        System.out.println(firstPersonWithNameStartingWithJ);
    }
}
