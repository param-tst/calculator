package com.example.calculator.test;


import com.example.calculator.Calculator;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;



public class TestAddition extends TestCase {
	Calculator calculator = null;

	public void setUp() {
		calculator = new Calculator();
	}

	// WithIn Boundary cases-1
	@Test
	public void testAdditionOfValidNegativesCase() {
		int result = calculator.add(-100, -100);
		System.out.println("The Result is" + result);
		assertEquals(-200, result);
	}

	// WithIn Boundary cases-2
	@Test
	public void testAdditionOfZerosValues() {
		int result = calculator.add(0, 0);
		System.out.println("The Result is" + result);
		assertEquals(0, result);
	}

	// WithIn Boundary cases-3
	@Test
	public void testAdditionOfAnyNumbers1() {
		int result = calculator.add(10, 5);
		System.out.println("The Result is" + result);
		assertEquals(15, result);
	}

	// WithIn Boundary cases-4
	@Test
	public void testAdditionOfAnyNumbers2() {
		int result = calculator.add(20, 50);
		System.out.println("The Result is" + result);
		assertEquals(25, result);
	}

	@Test
	public void testAdditionOfIntLimitsValidCase() {
		int result = calculator.add(Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println("The Result is" + result);
		assertEquals(-1, result);
	}

	// Boundaries threshold case-1
	@Test
	public void testAdditionOfIntLimitsPositiveCase() {
		int result = calculator.add(Integer.MAX_VALUE, 0);
		System.out.println("The Result is" + result);
		assertEquals(Integer.MAX_VALUE, result);
	}

	// Boundaries threshold case-2
	public void testAdditionOfIntegerNegLimits() {
		int result = calculator.add(Integer.MIN_VALUE, Integer.MIN_VALUE);
		System.out.println("The Result is" + result);
		assertEquals(0, result);
	}

	// Out of Boundary case-1
	@Test
	public void testAdditionOfInValidCaseForOverflow1() {
		try {
			int out = calculator.add(Integer.MAX_VALUE, 2);
			System.out.println("The Result is" + out);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "overflow case 1");
		}
	}

	// Out of Boundary case-2
	public void testAdditionOfInValidCaseForOverflow2() {
		try {
			int out = calculator.add(Integer.MIN_VALUE, -20);
			System.out.println("The Result is" + out);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "overflow case2");
		}
	}
}
