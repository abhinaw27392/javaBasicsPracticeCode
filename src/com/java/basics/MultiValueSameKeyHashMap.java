package com.java.basics;
import java.util.*;

public class MultiValueSameKeyHashMap {

	public static void main(String[] args) {
		Object[] arr1 = {1, "aaaa"};
		Object[] arr2 = {1, "bbbb"};
		Object[] arr3 = {1, "cccc"};
		Map<Integer, List> map = new HashMap<>();
		List<Object[]> list = new ArrayList<>();
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		List<Object> list2 = new ArrayList<>();
		
		for(Object[] obj : list) {
			list2.add(obj[1]);
			map.put((int)obj[0], list2);
		}
		System.out.println(map);
	}

}
