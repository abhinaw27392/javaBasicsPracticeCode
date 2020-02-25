package com.java.basics;

import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = scn.next();
		int count = 0;
		while (str.length() > 0) {
			count = findDuplicateChars(str, str.charAt(0));
			System.out.println(str.charAt(0) + ": " + count);
			str = str.replace(str.charAt(0) + "", "");
		}
	}

	public static int findDuplicateChars(String str, char c) {
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

}
