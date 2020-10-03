package com.training;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMaximum {

	@Test
	public void givenMaxIntValueAtFirst_ReturnsMaxValue() {
		Integer a=FindMaximum.findMaxInt(10,5,2);
		assertEquals(10, a.intValue());
	}
	@Test
	public void givenMaxIntValueAtSecond_ReturnsMaxValue() {
		Integer a=FindMaximum.findMaxInt(5,7,2);
		assertEquals(7, a.intValue());
	}
	@Test
	public void givenMaxIntValueAtThird_ReturnsMaxValue() {
		Integer a=FindMaximum.findMaxInt(-7,-5,-2);
		assertEquals(-2, a.intValue());
	}
	@Test
	public void givenMaxFloatValueAtFirst_ReturnsMaxValue() {
		Float a=FindMaximum.findMaxFloat(10.08f,10.01f,10.00f);
		assertEquals(10.08f,a.floatValue(),0.01f);
	}
	@Test
	public void givenMaxFloatValueAtSecond_ReturnsMaxValue() {
		Float a=FindMaximum.findMaxFloat(5.2552f,5.343f,5.234f);
		assertEquals(5.343f, a.floatValue(),0.001f);
	}
	@Test
	public void givenMaxFloatValueAtThird_ReturnsMaxValue() {
		Float a=FindMaximum.findMaxFloat(-1.71f,-1.21f,-1.11f);
		assertEquals(-1.11f, a.floatValue(),0.01f);
	}

}
