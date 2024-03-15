package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D10P08 {
		

		    @Test
		    public void testMul() {
		        Calculator calculator = new Calculator();
		        int result = calculator.mul(4, 5);
		        assertEquals(20, result);  // Expected result: 4 * 5 = 20
		    }

		    @Test
		    public void testDiv() {
		        Calculator calculator = new Calculator();
		        int result = calculator.div(10, 2);
		        assertEquals(5, result);  // Expected result: 10 / 2 = 5
		    }

		    @Test(expected = IllegalArgumentException.class)
		    public void testDivByZero() {
		        Calculator calculator = new Calculator();
		        calculator.div(10, 0);  // Division by zero should throw IllegalArgumentException
		    }


}



