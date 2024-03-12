package com.learning.core.day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D05P04 {
	
	public static void main(String[] args) {
	       
        class Product {
            private String productId;
            private String productName;

            public Product(String productId, String productName) {
                this.productId = productId;
                this.productName = productName;
            }

            public boolean equals(Object o) {
                if (o instanceof Product) {
                    Product other = (Product) o;
                    return this.productId.equals(other.productId);
                }
                return false;
            }

            public int hashCode() {
                return productId.hashCode();
            }

            @Override
            public String toString() {
                return productId + " " + productName;
            }
        }

      
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product Id and name to search for:");
        String productId = scanner.next();
        String productName = scanner.next();
        Product searchProduct = new Product(productId, productName);
        if (productSet.contains(searchProduct)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }

}
