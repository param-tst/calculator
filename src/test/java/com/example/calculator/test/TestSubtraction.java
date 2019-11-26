package com.example.calculator.test;

import org.junit.Test;
import junit.framework.TestCase;
import com.example.calculator.Calculator;

public class TestSubtraction extends TestCase {
	Calculator calculator = null;

	public void setUp() {
		calculator = new Calculator();

	}

	
//WithinBoundries Val check
	@Test
	public void subtractionOfIntegerMaxByItself() {
		int result = calculator.subtract(Integer.MAX_VALUE, Integer.MAX_VALUE);
		System.out.println("result is " + result);
		assertEquals(result, 0);
	}

	@Test
	public void subtractionOfIntegerMinByItself() {
		int result = calculator.subtract(Integer.MIN_VALUE, Integer.MIN_VALUE);
		System.out.println("result is " + result);
		assertEquals(result, 0);
	}

	@Test
	public void subtractionOfIntegerMinByZero() {
		int result = calculator.subtract(0, Integer.MIN_VALUE);
		System.out.println("result is " + result);
		assertEquals(result, Integer.MIN_VALUE);
	}

	@Test
	public void subtractionOfIntegerMaxByZero() {
		int result = calculator.subtract(0, Integer.MAX_VALUE);
		System.out.println("result is " + result);
		assertEquals(result, -2147483647);
	}

	@Test
	public void subtractionOfANegativeMaxInteger() {
		try {
			int result = calculator.subtract(Integer.MAX_VALUE, -100);
			System.out.println("result is " + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}

	}

	@Test
	public void subtractionOfZeroFromMaxInteger() {
		int result = calculator.subtract(Integer.MAX_VALUE, 0);
		System.out.println("result is " + result);
		assertEquals(result, Integer.MAX_VALUE);
	}

	@Test
	public void subtractionOfZeroFromMinInteger() {
		int result = calculator.subtract(Integer.MIN_VALUE, 0);
		System.out.println("result is " + result);
		assertEquals(result, Integer.MIN_VALUE);
	}

	@Test
	public void subractionIntMinFromIntMax() {
		try {
			int result = calculator.subtract(Integer.MAX_VALUE, Integer.MIN_VALUE);
			System.out.println("result is " + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}

	}
	
	@Test
	public void subtractionFromIntegerMn() {
		try {
			int result = calculator.subtract(Integer.MIN_VALUE, 1);
			System.out.println("result is " + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}

	}

	

}