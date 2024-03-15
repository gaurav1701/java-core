package com.learning.core.day10;

	
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D10P09 {
		

		    @Test
		    public void testFindMaxPositive() {
		        Calculator calculator = new Calculator();
		        int[] arr = {1, 2, 3, 4, 5, 6};
		        int result = calculator.findMax(arr);
		        assertEquals(6, result);  // Expected result: 6
		    }

		    @Test
		    public void testFindMaxNegative() {
		        Calculator calculator = new Calculator();
		        int[] arr = {-1, -2, -3, -4, -5, -6};
		        int result = calculator.findMax(arr);
		        assertEquals(-1, result);  // Expected result: -1
		    }

}



