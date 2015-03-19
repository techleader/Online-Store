package com.nayak.app;

import junit.framework.Assert;

import org.junit.Test;

public class NumericTest {

	@Test(expected=ArithmeticException.class)			
	public void testInteger_DividedByZero(){
		int x= 5;
		int y=0;		
		int total = x/y;
		System.out.println(x/y);
	}
	
	@Test(expected=ArithmeticException.class)			
	public void testLong_DividedByZero(){
		long x= 5;
		long y=0;		
		long total = x/y;
		System.out.println(x/y);
	}
	
	@Test
	public void testDoubler_DividedByZero(){
		double x= 0.0;
		double y=0.0;		
		double total = x/y;
		System.out.println(total);
	}
	
	
	@Test
	public void testFloat_DividedByZero(){
		float x= 0.0f;
		float y=0.0f;		
		float total = x/y;
		System.out.println(total);
	}
}
