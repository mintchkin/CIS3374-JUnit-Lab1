package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	public void subtractTest() {
		assertEquals(2, calculator.subtract(5, 3));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(24, calculator.multiply(6, 4));
	}
	
	@Test
	public void divideTest() {
		assertEquals(5, calculator.divide(10, 2));
	}
	
	@Test
	public void isEqualTest() {
		assertTrue(calculator.isEqual(2, 2));
		assertFalse(calculator.isEqual(2, 3));
	}
}
