package com.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(2);
		
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		System.out.println("list is: " + list);
		
		Integer[] strArr = list.toArray(new Integer[list.toArray().length]);
		System.out.println("array is: " + Arrays.toString(strArr));
		
		//reverse an array
		Integer[] arr = {2,3,4,5,6,7};
		System.out.println("actual array is: " + Arrays.toString(arr));
		Collections.reverse(Arrays.asList(arr));
		System.out.println("reversed array is: " + Arrays.toString(arr));
		
//		int[] arr2 = new int[arr.length];
//		for(int i = arr.length -1, j = 0; i>=0; i--, j++) {
//			arr2[j] = arr[i];
//		}
//		System.out.println(Arrays.toString(arr2));
	}

}
