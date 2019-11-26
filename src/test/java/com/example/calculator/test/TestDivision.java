package com.example.calculator.test;


import com.example.calculator.Calculator;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;



public class TestDivision extends TestCase {
	Calculator calculator = null;

	public void setUp() {
		calculator = new Calculator();
	}

//Valid case-1
	@Test
	public void divisionRemainderZero() {
		int result = calculator.divide(100, 2);
		System.out.println("Result is" + result);
		assertEquals(result, 50);
	}

//Valid case-2
	@Test
	public void divisionRemainderNotZero() {
		int result = calculator.divide(100, 3);
		System.out.println("Result is" + result);
		assertEquals(result, 33);
	}

	// Valid case-3
	@Test
	public void divisionByANegativeNumber() {
		int result = calculator.divide(100, -2);
		System.out.println("Result is" + result);
		assertEquals(result, -50);
	}

	// Valid case-4
	@Test
	public void divisionDenominatorIsBigger() {
		int result = calculator.divide(1, 2);
		System.out.println("Result is" + result);
		assertEquals(result, 0);
	}

	// Valid case-5
	@Test
	public void divisionNumeratorIsZero() {
		int result = calculator.divide(0, 19);
		System.out.println("Result is" + result);
		assertEquals(result, 0);
	}

	// Valid case-6
	@Test
	public void divisionNumeratorIsNegative() {
		int result = calculator.divide(-19, 19);
		System.out.println("Result is" + result);
		assertEquals(result, -1);
	}

	// Valid case-7
	@Test
	public void divisionBySameNos() {
		int result = calculator.divide(Integer.MAX_VALUE, Integer.MAX_VALUE);
		System.out.println("Result is" + result);
		assertEquals(result, 1);
	}

	// Valid case-8
	@Test
	public void divisionOfMinIntByANo() {
		int result = calculator.divide(Integer.MIN_VALUE, 2);
		System.out.println("Result is" + result);
		assertEquals(result, -1073741824);
	}

	// Valid case-9
	@Test
	public void divisionBothPositiveNos() {
		int result = calculator.divide(Integer.MAX_VALUE, 2);
		System.out.println("Result is" + result);
		assertEquals(result, 1073741823);
	}

	// threshold Valid cases
	@Test
	public void divisionBothNosAreNegative() {
		int result = calculator.divide(Integer.MIN_VALUE, -2);
		System.out.println("Result is" + result);
		assertEquals(result, 1073741824);
	}

	// exception or out of boundaries value case
	@Test
	public void divisionOfZeros() {
		try {
			int result = calculator.divide(1, 0);
			System.out.println("Result is" + result);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "denominator cannot be ZZero");
		}
	}
}