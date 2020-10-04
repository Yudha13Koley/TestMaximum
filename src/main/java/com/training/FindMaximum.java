package com.training;

public class FindMaximum<E extends Comparable<E>>{
	public E a;
	public E b;
	public E c;
	public FindMaximum(E a,E b,E c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public E findMax(){
	E max=a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}

}
