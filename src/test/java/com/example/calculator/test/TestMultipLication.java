package com.example.calculator.test;

import org.junit.Test;
import com.example.calculator.Calculator;
import junit.framework.TestCase;

public class TestMultipLication extends TestCase {
	Calculator calculator = null;

	public void setUp() {
		calculator = new Calculator();

	}

//Valid test case-1
	
	@Test
	public void testMultiplicationWithZero() {
		int result = calculator.multiply(0, Integer.MAX_VALUE);
		System.out.println("Result is" + result);
		assertEquals(0, result);

	}
	//Valid test case-2
	
	@Test
	public void testMultiplicationWithAllZeros() {
		int result = calculator.multiply(0, 0);
		System.out.println("Result is" + result);
		assertEquals(0, result);

	}

	@Test
	public void testMultiplicationWithAllBothNegativeWithinRange() {
		int result = calculator.multiply(-29, -1000);
		System.out.println("Result is" + result);
		assertEquals(29000, result);

	}

	@Test
	public void testMultiplicationOutOfRangePositive() {
		try {
			int result = calculator.multiply(Integer.MAX_VALUE, 2);
			System.out.println("Result is" + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}

	}

	@Test
	public void testMultiplicationOutOfRangeNegatives() {
		try {
			int result = calculator.multiply(Integer.MIN_VALUE, 2);
			System.out.println("Result is" + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}

	}

	@Test
	public void testMultiplicationNegativeAndPositivesOutOfRange() {
		try {
			int result = calculator.multiply(Integer.MIN_VALUE, 2);
			System.out.println("Result is" + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}
	}

	@Test
	public void testMultiplicationNegativeAndPositivesInRange() {

		int result = calculator.multiply(-1500, 2);
		System.out.println("Result is" + result);
		assertEquals(-3000, result);
	}

	@Test
	public void multiplyTwoRanges() {

		try {
			int result = calculator.multiply(Integer.MIN_VALUE, Integer.MAX_VALUE);
			System.out.println("Result is" + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}
	}

	@Test
	public void multiplyToGetOutOfPositiveRange() {

		try {
			int result = calculator.multiply(Integer.MAX_VALUE / 2 + 1, 2);
			System.out.println("Result is" + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}
	}

	@Test
	public void multiplyToGetOutOfNegativegRange() {

		try {
			int result = calculator.multiply(Integer.MIN_VALUE / 2 - 1, 2);
			System.out.println("Result is" + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}
	}

	@Test
	public void multiplyToGetToThePositiveRange() {
		try {
			int result = calculator.multiply(Integer.MIN_VALUE, -1);
			System.out.println("Result is" + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}

	}

	@Test
	public void multiplyToGetToTheNegativeRange() {

		int result = calculator.multiply(Integer.MAX_VALUE, -1);
		System.out.println("Result is" + result);
		assertEquals(-2147483647, result);

	}

//threshhold check1
	@Test
	public void multiplyToGetToNegRange() {

		int result = calculator.multiply(-1073741824, 2);
		System.out.println("Result is" + result);
		assertEquals(Integer.MIN_VALUE, result);

	}

//threshhold check2
	@Test
	public void multiplyOutOfRangePositive() {
		try {
			int result = calculator.subtract(Integer.MIN_VALUE, Integer.MAX_VALUE);
			System.out.println("result is " + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Threshhold Limit crossed");
		}

	}

}