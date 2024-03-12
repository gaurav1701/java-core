package com.learning.core.day6;

import java.util.Scanner;
import java.util.TreeMap;

public class D06P09 {
    private String name;
    private double price;

    public D06P09(String name, double price) {
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
        D06P09 d06p09 = (D06P09) obj;
        return Double.compare(d06p09.price, price) == 0 && name.equals(d06p09.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        long temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int compareTo(D06P09 other) {
        return Double.compare(price, other.price);
    }

    public static void main(String[] args) {
        D06P09 car1 = new D06P09("Benz", 900000.0);
        D06P09 car2 = new D06P09("Audi", 600100.0);
        D06P09 car3 = new D06P09("Swift", 305000.0);
        D06P09 car4 = new D06P09("Bugatti", 80050.0);

        TreeMap<Double, D06P09> cars = new TreeMap<>();
        cars.put(car1.price, car1);
        cars.put(car2.price, car2);
        cars.put(car3.price, car3);
        cars.put(car4.price, car4);

        System.out.println("Before replacing the value:");
        for (Double price : cars.keySet()) {
            System.out.println(cars.get(price));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key (price): ");
        double newPrice = scanner.nextDouble();
        scanner.close();

        D06P09 newCar = new D06P09("Reva", newPrice);
        cars.put(newPrice, newCar);

      //  System.out.println("\nAfter replacing the value:");
        for (Double price : cars.keySet()) {
            System.out.println(cars.get(price).name + cars.get(price).price);
        }
    }
}
