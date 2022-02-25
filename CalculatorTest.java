package sampleGit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(0, c.add(0, 0));
		assertEquals(8, c.add(2, 6));
	}

	@Test
	public void testMultiply() {
		Calculator c = new Calculator();
		assertEquals(0, c.multiply(0, 0));
		assertEquals(8, c.multiply(2, 4));
	}
}
