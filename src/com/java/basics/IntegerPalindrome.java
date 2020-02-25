package com.java.basics;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		
		System.out.println(isPalindrome(num));
	}
	
	public static boolean isPalindrome(int num) {
		int pal = num;
		int rev = 0;
		while(num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if(rev == pal) {
			return true;
		}
		return false;
	}

}
