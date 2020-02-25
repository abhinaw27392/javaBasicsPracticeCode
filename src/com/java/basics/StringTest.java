package com.java.basics;

public class StringTest {

	public static void main(String[] args) {
		String A = "hello";
		String B = "java";
		System.out.println(A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0))) +" "+ B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0))));

	}

}
