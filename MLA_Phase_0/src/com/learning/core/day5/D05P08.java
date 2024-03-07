package com.learning.core.day5;

import java.util.Objects;
import java.util.TreeSet;

class Person1 implements Comparable<Person1> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters

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

    // toString method
    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    // Equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return id == person1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Comparable implementation for natural sorting
    @Override
    public int compareTo(Person1 o) {
        return Integer.compare(this.id, o.id);
    }
}
public class D05P08 {
	
	  public static void main(String[] args) {
		  TreeSet<Person1> personSet = new TreeSet<>();

	        // Adding predefined information of 6 persons
	        personSet.add(new Person1(101, "Jerry", 30, 50000));
	        personSet.add(new Person1(102, "Smith", 40, 60000));
	        personSet.add(new Person1(103, "Popeye", 35, 55000));
	        personSet.add(new Person1(104, "Jones", 45, 65000));
	        personSet.add(new Person1(105, "John", 25, 45000));
	        personSet.add(new Person1(106, "Tom", 50, 70000));

	        // Printing all names in uppercase
	        for (Person1 person : personSet) {
	            System.out.println(person.getName().toUpperCase());
	        }
	    }

}
