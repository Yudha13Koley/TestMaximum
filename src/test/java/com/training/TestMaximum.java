package com.training;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMaximum {

	@Test
	public void givenMaxValueAtFirst_ReturnsMaxValue() {
		Integer a=FindMaximum.findMax(10,5,2);
		assertEquals(10, a.intValue());
	}
	@Test
	public void givenMaxValueAtSecond_ReturnsMaxValue() {
		Integer a=FindMaximum.findMax(5,7,2);
		assertEquals(7, a.intValue());
	}
	@Test
	public void givenMaxValueAtThird_ReturnsMaxValue() {
		Integer a=FindMaximum.findMax(-7,-5,-2);
		assertEquals(-2, a.intValue());
	}

}
