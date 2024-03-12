package com.learning.core.day6;

import java.util.Comparator;
import java.util.TreeMap;

public class D06P06 implements Comparable<D06P06> {
	
	private String name;
    private double price;

    public D06P06(String name, double price) {
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
        D06P06 d06p06 = (D06P06) obj;
        return Double.compare(d06p06.price, price) == 0 && name.equals(d06p06.name);
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
    public int compareTo(D06P06 other) {
        return Double.compare(price, other.price);
    }


	public static void main(String[] args) {
		
		D06P06 d06p06_1 = new D06P06("Benz", 900000.0);
        D06P06 d06p06_2 = new D06P06("Audi", 600100.0);
        D06P06 d06p06_3 = new D06P06("Swift", 305000.0);
        D06P06 d06p06_4 = new D06P06("Bugatti", 80050.0);

        TreeMap<D06P06, D06P06> d06p06s = new TreeMap<>(Comparator.reverseOrder());
        d06p06s.put(d06p06_1, d06p06_1);
        d06p06s.put(d06p06_2, d06p06_2);
        d06p06s.put(d06p06_3, d06p06_3);
        d06p06s.put(d06p06_4, d06p06_4);

        for (D06P06 d06p06 : d06p06s.values()) {
            System.out.println(d06p06);
        }

	}

}
