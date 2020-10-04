package com.training;

import java.util.*;



public class FindMaximum<E extends Comparable<E>>{
	public List<E> arr;

	public FindMaximum(E a,E b,E c) {
		arr=new ArrayList<E>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
	}
	public FindMaximum() {
		arr=new ArrayList<E>();
	}
	public void addInputs(E a){	
		arr.add(a);
	}
	public E findMax(){
	E max=arr.get(0);
		for(E element : arr)
		{
			if(element.compareTo(max)>0)
			max=element;
		}
		printMax(max);
		return max;
	}
	public E findMaxBySorting() {
		E max= arr.stream().sorted((i,j)->i.compareTo(j)).sorted(Comparator.reverseOrder()).findFirst().orElse(null);
		printMax(max);
		return max;
	}
	public void printMax(E a) {
		System.out.println(a);
	}

}
