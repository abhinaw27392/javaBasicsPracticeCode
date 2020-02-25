package com.java.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
//		if (isPrime(num)) {
//			System.out.println("prime number");
//		} else
//			System.out.println("not prime");
		
		findPrime(num);

	}

	public static void findPrime(int n) {
		for (int i = 2; i <= n; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
