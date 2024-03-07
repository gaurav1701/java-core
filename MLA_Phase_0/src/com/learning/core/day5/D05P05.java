package com.learning.core.day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Product {
    private String id;
    private String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return id.equals(product.getId());
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class D05P05 {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        products.add(new Product("P001", "maruti 800"));
        products.add(new Product("P002", "Maruti Dezire"));
        products.add(new Product("P003", "Maruti Alto"));
        products.add(new Product("P004", "Maruti Baleno"));

        System.out.println("Initial products:");
        for (Product product : products) {
            System.out.println(product);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product ID to remove: ");
        String idToRemove = scanner.nextLine();
        Product productToRemove = new Product(idToRemove, "");
        if (products.remove(productToRemove)) {
            System.out.println("Product with id " + idToRemove + " removed.");
        } else {
            System.out.println("Product with id " + idToRemove + " not found.");
        }

        System.out.println("Products after removal:");
        for (Product product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}
