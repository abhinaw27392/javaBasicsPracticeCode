package com.java.basics;

public class MultiplyTwoNumberWithoutLoopOrMul {
	static int res;
	static int ctr;

	public static void main(String[] args) {
		System.out.println(multiplyMethod(8, 9));
	}

	private static int multiplyMethod(int num1, int num2) {
		res = res + num1;
		ctr++;
		if (ctr >= num2)
			return res;
		return multiplyMethod(num1, num2);
	}

}
