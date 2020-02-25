package com.java.basics;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSquareRoot {
	static int count = 0;

	public static void main(String[] args) {
		int a = 1;
		int b = 2000;
		int tempCount = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = a; i <= b; i++) {
			count = 0;
			tempCount = numberOfSqureRoot(i);
			if (tempCount != 0) {
				map.put(i, tempCount);
			}
		}

		int maxNumber = 0;
		int maxValue = 0;
		// fetching the map and getting max value
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int tempNumber = entry.getKey();
			int tempValue = entry.getValue();
			if (tempValue > maxValue) {
				maxNumber = tempNumber;
				maxValue = tempValue;
			}

		}
		System.out.println("Number: " + maxNumber + ", Max No of SquareRoot: " + maxValue);
	}

	public static int numberOfSqureRoot(int num) {
		if (Math.sqrt(num) % 1 == 0 && num != 1) {
			count++;
			numberOfSqureRoot((int) Math.sqrt(num));
		}
		return count;
	}

}
