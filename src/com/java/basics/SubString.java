package com.java.basics;

public class SubString {

	public static void main(String[] args) {
		String str = "French (France)";
		String str2 = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
		System.out.println(str2);
	}

}
