package com.java.basics;

//wap to reverse a string without using string inbuilt functions
public class StringReverse {

	public static void main(String[] args) {
		String str1 = "abcdef";
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		System.out.println(sb.reverse());

		// without using reverse() method.
		char[] arr = str1.toCharArray();
		StringBuilder sb2 = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb2.append(arr[i]);
		}
		System.out.println(sb2.toString());
	}

}
