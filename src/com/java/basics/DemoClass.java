package com.java.basics;

import java.util.Arrays;

public class DemoClass {
	public static void main(String[] args) {
		Integer num1 = 200;
		Integer num2 = 200;
		if(num1 == num2) {
			System.out.println("same");
		}
		else 
			System.out.println("different");
		
		double a = 1.0;
		double b = 0.0;
		System.out.println(a/b);
		
		char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        System.out.println(str);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        
	}
}