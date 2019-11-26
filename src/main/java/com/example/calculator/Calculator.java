package com.example.calculator;

public class Calculator implements ICalculator {

	public int add(int x, int y) {
		int result = x + y;
		//covering exception cases here for values lesser than zero but results are positive or negative for overflow or long values out of action
		System.out.println(result);
		if (x < 0 & y < 0) {
			if (result > 0) {
				throw new ArithmeticException(
						"Overflow detected");
			}

		} else if (x > 0 & y > 0) {
			if (result < 0) {
				throw new ArithmeticException(
						"Overflow detected");
			}
		}
		
		return result;
	}

	
	public int multiply(int x, int y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		long result = (long) x * (long) y;
		System.out.println(result);
		//covering exception cases here for values overflow
		if ((int) result != result) {
			throw new ArithmeticException("result value is greater|smaller than Max|Min integer");
		}
		return (int) result;

	}

	public int divide(int x, int y) {
		//covering exception of zero
		if (y == 0) {
			throw new ArithmeticException("denominator cannot be zero");
		}
		int result = x / y;
		System.out.println(result);
		// check different signs by x-oring
		// if the most significant bit matches,the result 's most significant bit is zero else 1
		if ((x ^ y) < 0) {
			// check overflows
			if (result > 0) {
				throw new ArithmeticException(
						"The result should be negative");
			} else {
				System.out.println(result);
				return result;
			}
		}
		return result;

	}

	public int subtract(int x, int y) {

		int result = x - y;
		// if one of the inputs are negative,check if the sum is
		int xor = x ^ y;

		
		// covering exception of overflow here after calculation
		if (xor < 0 && x > 0 && result < 0) {
			throw new ArithmeticException("integer limit overflown");
		} //  covering exception of overflow here after calculation
		else if (xor < 0 && x < 0 && result > 0) {
			throw new ArithmeticException("integer limit overflown");
		}
		return result;
	}
}