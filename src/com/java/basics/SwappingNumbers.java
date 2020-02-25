package com.java.basics;

public class SwappingNumbers {
	
	public static void main(String[] args) {
		//swapping two numbers using third variable
		int a = 23;
		int b = 34;
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a is: " + a + ", b is: " + b);
		
		//without using third variable
		int c = 26;
		int d = 37;
		c = c + d;
		d = c - d;
		c = c - d;
		
		System.out.println("c is: " + c + ", d is: " + d);
	}

}
