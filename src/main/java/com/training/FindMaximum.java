package com.training;

public class FindMaximum {
	public static Integer findMaxInt(Integer a,Integer b,Integer c) {
		Integer max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}
	public static Float findMaxFloat(Float a,Float b,Float c) {
		Float max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}
	public static String findMaxString(String a,String b,String c) {
		String max=a;
		if(b.compareToIgnoreCase(max)>0)
			max=b;
		if(c.compareToIgnoreCase(max)>0)
			max=c;
		return max;
	}

}
