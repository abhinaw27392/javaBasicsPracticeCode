package com.java.basics;

import java.util.Arrays;

public class QuickSortTest {

	public static void main(String[] args) {
		Integer[] arr = { 8, 4, 4, 1, 1, 2, 6, 4, 1, 20, 10, 12 };

		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(Integer[] arr, int low, int high) {
		
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];

		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}
	}

	public static void swap(Integer array[], int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
