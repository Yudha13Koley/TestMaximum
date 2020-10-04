package com.training;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestMaximum {
		
		@Test
	public void givenMaxIntValueAtFirst_ReturnsMaxValue() {
		FindMaximum<Integer> fm=new FindMaximum<Integer>();
		Integer arr[]= {100,5,2,6,7,8,5,14,13,11,8};
		for(Integer i: arr)
		{
			fm.addInputs(i);
		}
		Integer a=fm.findMaxBySorting();
		assertEquals(100, a.intValue());
	}
	@Test
	public void givenMaxIntValueAtSecond_ReturnsMaxValue() {
		FindMaximum<Integer> fm=new FindMaximum<Integer>();
		Integer arr[]= {10,20,2,6,7,8,5,14,13,11,8};
		for(Integer i: arr)
		{
			fm.addInputs(i);
		}
		Integer a=fm.findMaxBySorting();
		assertEquals(20, a.intValue());
	}
	@Test
	public void givenMaxIntValueAtThird_ReturnsMaxValue() {
		FindMaximum<Integer> fm=new FindMaximum<Integer>();
		Integer arr[]= {10,20,23,6,7,8,5,14,13,11,8};
		for(Integer i: arr)
		{
			fm.addInputs(i);
		}
		Integer a=fm.findMaxBySorting();
		assertEquals(23, a.intValue());
	}
	@Test
	public void givenMaxFloatValueAtFirst_ReturnsMaxValue() {
		FindMaximum<Float> fm=new FindMaximum<Float>();
		Float arr[]= {10.08f,10.01f,10.00f,10.07f,10.06f};
		for(Float i: arr)
		{
			fm.addInputs(i);
		}
		Float a=fm.findMaxBySorting();
		assertEquals(10.08f,a.floatValue(),0.01f);
	}
	@Test
	public void givenMaxFloatValueAtSecond_ReturnsMaxValue() {
		FindMaximum<Float> fm=new FindMaximum<Float>();
		Float arr[]= {10.08f,10.11f,10.00f,10.07f,10.06f};
		for(Float i: arr)
		{
			fm.addInputs(i);
		}
		Float a=fm.findMaxBySorting();
		assertEquals(10.11f,a.floatValue(),0.01f);
	}
	@Test
	public void givenMaxFloatValueAtThird_ReturnsMaxValue() {
		FindMaximum<Float> fm=new FindMaximum<Float>();
		Float arr[]= {10.08f,10.01f,10.11f,10.07f,10.06f};
		for(Float i: arr)
		{
			fm.addInputs(i);
		}
		Float a=fm.findMaxBySorting();
		assertEquals(10.11f,a.floatValue(),0.01f);
	}
	@Test
	public void givenMaxStringValueAtFirst_ReturnsMaxValue() {
		FindMaximum<String> fm=new FindMaximum<String>();
		String arr[]= {"peach","apple","banana"};
		for(String i: arr)
		{
			fm.addInputs(i);
		}
		String a=fm.findMaxBySorting();
		assertEquals("peach",a);
	}
	@Test
	public void givenMaxStringValueAtSecond_ReturnsMaxValue() {
		FindMaximum<String> fm=new FindMaximum<String>();
		String arr[]= {"apple","peach","banana"};
		for(String i: arr)
		{
			fm.addInputs(i);
		}
		String a=fm.findMaxBySorting();
		assertEquals("peach",a);
	}
	@Test
	public void givenMaxStringValueAtThird_ReturnsMaxValue() {
		FindMaximum<String> fm=new FindMaximum<String>();
		String arr[]= {"banana","apple","peach"};
		for(String i: arr)
		{
			fm.addInputs(i);
		}
		String a=fm.findMaxBySorting();
		assertEquals("peach",a);
		}

}
