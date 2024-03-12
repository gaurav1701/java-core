package com.learning.core.day6;

import java.util.Comparator;
import java.util.TreeMap;

public class D06P08 implements Comparable<D06P08> {
    private String name;
    private double price;

    public D06P08(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        D06P08 d06p08 = (D06P08) obj;
        return Double.compare(d06p08.price, price) == 0 && name.equals(d06p08.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        long temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(D06P08 other) {
        return Double.compare(price, other.price);
    }

    public static void main(String[] args) {
        D06P08 car1 = new D06P08("Benz", 900000.0);
        D06P08 car2 = new D06P08("Audi", 600100.0);
        D06P08 car3 = new D06P08("Swift", 305000.0);
        D06P08 car4 = new D06P08("Bugatti", 80050.0);

        TreeMap<D06P08, Double> cars = new TreeMap<>(Comparator.naturalOrder());
        cars.put(car1, car1.price);
        cars.put(car2, car2.price);
        cars.put(car3, car3.price);
        cars.put(car4, car4.price);

      /*  System.out.println("Before removing the greatest price:");
        for (D06P08 car : cars.descendingMap().keySet()) {
            System.out.println(car);
        }

        cars.remove(cars.lastKey());

        System.out.println("\nAfter removing the greatest price:");*/
        for (D06P08 car : cars.keySet()) {
            System.out.println(car);
        }
    }
}
