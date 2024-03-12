package com.learning.core.day6;

import java.util.Comparator;
import java.util.TreeMap;

public class D06P07 implements Comparable<D06P07> {
    private String name;
    private double price;

    public D06P07(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        D06P07 car = (D06P07) obj;
        return Double.compare(car.price, price) == 0 && name.equals(car.name);
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
    public int compareTo(D06P07 other) {
        return Double.compare(price, other.price);
    }

    public static void main(String[] args) {
        D06P07[] carsArray = {
                new D06P07("Benz", 900000.0),
                new D06P07("Audi", 600100.0),
                new D06P07("Swift", 305000.0),
                new D06P07("Bugatti", 80050.0)
        };

        TreeMap<D06P07, Double> carsMap = new TreeMap<>(Comparator.naturalOrder());

        for (D06P07 car : carsArray) {
            carsMap.put(car, car.price);
        }

        System.out.println("Highest price car: " + carsMap.lastEntry().getKey());
        System.out.println("Lowest price car: " + carsMap.firstEntry().getKey());
    }
}
