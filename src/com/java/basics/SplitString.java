package com.java.basics;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {

		// Split string in chunks
		String str = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < str.length() - 4; i++) {
			String subString = str.substring(i, i + 4);
			System.out.println(subString);
		}

		// another programme for any integer number is power of two or not
		System.out.print("Enter a number: ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(isPowerOfTwo(num));
	}

	private static boolean isPowerOfTwo(int num) {
		int res = 2;
		while (res <= num) {
			res = res * 2;
			if (res == num)
				return true;
		}
		return false;
	}

}
