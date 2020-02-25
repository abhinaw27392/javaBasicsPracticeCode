package com.java.basics;

public class PowerFunctionWithoutMultiplication {

	public static void main(String[] args) {
		System.out.println(powerMethod(5, 4));
	}

	private static int powerMethod(int base, int pow) {
		int res = base;
		int temp = base;
		for (int i = 1; i < pow; i++) {
			for (int j = 1; j < base; j++) {
				res = res + temp;
			}
			temp = res;
		}
		return res;
	}

}
