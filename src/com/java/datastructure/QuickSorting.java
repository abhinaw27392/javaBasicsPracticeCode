package com.java.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSorting {

	public static void main(String[] args) {
		System.out.println("Enter array size: ");
		Scanner sc1 = new Scanner(System.in);
		int size = sc1.nextInt();

		System.out.println("Enter array elements: ");
		Scanner sc2 = new Scanner(System.in);
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc2.nextInt();
		}
		System.out.println("unsorted array is: " + Arrays.toString(arr));

		// logic for quick sort
		// step 1 - let us assume the last element as a pivot element
		int pivot = arr[size - 1];

		// Step 2 - Reorder the list so that values less than pivot come to left and the
		// values more than pivot go to right side.
		int index = 0;
		int current = arr[0];
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= pivot) {
				// here swapping occurs
				temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;

				current = arr[i + 1];
				index++;
			}
			if (arr[i] > pivot) {
				current = arr[index + 1];
			}
		}
		if (arr[index] > pivot) {
			// swap(i, arr, index);
		}

		System.out.println("after step 1 array is: " + Arrays.toString(arr));
		// recursively apply above steps
	}

	private static int[] swap(int i, int[] arr, int index) {
		int temp = arr[i];
		arr[i] = arr[index];
		arr[index] = temp;
		return arr;
	}

}
