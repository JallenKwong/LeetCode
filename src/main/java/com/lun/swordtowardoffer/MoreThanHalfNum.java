package com.lun.swordtowardoffer;

import java.util.ArrayList;
import java.util.List;

public class MoreThanHalfNum {

	public void a() {
		List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
		List<? extends Number> foo4 = new ArrayList<Integer>(); // Integer extends Number
		List<? extends Number> foo5 = new ArrayList<Double>();  // Double extends Number
		
		
		//foo3.add(Double.valueOf(1));
		
		List<? super Integer> foo6 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
		List<? super Integer> foo7 = new ArrayList<Number>();   // Number is a superclass of Integer
		List<? super Integer> foo8 = new ArrayList<Object>();   // Object is a superclass of Integer
		
		foo6.add(Integer.valueOf(1));
//		foo6.add(new Object());
		System.out.println("---");
	}
	
	public static void main(String[] args) {
		System.out.println(Math.round(-1.5));//-1
		System.out.println(Math.round(1.5));//2
	}
}
