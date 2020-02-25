package com.java.basics;

public class MinimumDifference {

	// Returns the distance between the two closest numbers.
	static int distClosestNumbers(int[] numbers) {
		int result = Math.abs(numbers[0] - numbers[1]);;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int diff = Math.abs(numbers[i] - numbers[j]);
				if (diff < result) {
					result = diff;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] testArray = { 3, 50, 15, 99, 7, 65 };
		int result = distClosestNumbers(testArray);
		System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
	}
}
