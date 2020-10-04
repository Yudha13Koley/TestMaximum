package com.training;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMaximum {

	@Test
	public void givenMaxIntValueAtFirst_ReturnsMaxValue() {
		Integer a=new FindMaximum<Integer>(10,5,2).findMax();
		assertEquals(10, a.intValue());
	}
	@Test
	public void givenMaxIntValueAtSecond_ReturnsMaxValue() {
		Integer a=new FindMaximum<Integer>(2,6,5).findMax();
		assertEquals(6, a.intValue());
	}
	@Test
	public void givenMaxIntValueAtThird_ReturnsMaxValue() {
		Integer a=new FindMaximum<Integer>(-3,-6,-2).findMax();
		assertEquals(-2, a.intValue());
	}
	@Test
	public void givenMaxFloatValueAtFirst_ReturnsMaxValue() {
		Float a=new FindMaximum<Float>(10.08f,10.01f,10.00f).findMax();
		assertEquals(10.08f,a.floatValue(),0.01f);
	}
	@Test
	public void givenMaxFloatValueAtSecond_ReturnsMaxValue() {
		Float a=new FindMaximum<Float>(5.2552f,5.343f,5.234f).findMax();
		assertEquals(5.343f, a.floatValue(),0.001f);
	}
	@Test
	public void givenMaxFloatValueAtThird_ReturnsMaxValue() {
		Float a=new FindMaximum<Float>(-1.71f,-1.21f,-1.11f).findMax();
		assertEquals(-1.11f, a.floatValue(),0.01f);
	}
	@Test
	public void givenMaxStringValueAtFirst_ReturnsMaxValue() {
		String a=new FindMaximum<String>("peach","apple", "banana").findMax();
		assertEquals("peach",a);
	}
	@Test
	public void givenMaxStringValueAtSecond_ReturnsMaxValue() {
		String a= new FindMaximum<String>("apple","peach","banana").findMax();
		assertEquals("peach",a);
	}
	@Test
	public void givenMaxStringValueAtThird_ReturnsMaxValue() {
		String a=new FindMaximum<String>("apple","banana","peach").findMax();
		assertEquals("peach",a);
		}

}
