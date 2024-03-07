package com.learning.core.day5;

import java.util.Comparator;
import java.util.TreeSet;

class Person4 {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person4(int id, String name, int age, double salary) {
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
        Person4 person = (Person4) obj;
        return id == person.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static Comparator<Person4> AGE_COMPARATOR = new Comparator<Person4>() {
        @Override
        public int compare(Person4 p1, Person4 p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    };
}

public class D05P06 {
    public static void main(String[] args) {
        TreeSet<Person4> persons = new TreeSet<>(Person4.AGE_COMPARATOR);
        persons.add(new Person4(1, "John", 32, 1999.0));
        persons.add(new Person4(2, "Jane", 22, 1500.0));
        persons.add(new Person4(3, "Mary", 23, 2200.0));
        persons.add(new Person4(4, "Bob", 25, 1800.0));
        persons.add(new Person4(5, "Tom", 42, 3999.0));
        persons.add(new Person4(6, "Peter", 20, 2000.0));

        System.out.println("Persons whose age is greater than 25:");
        for (Person4 person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
    
}