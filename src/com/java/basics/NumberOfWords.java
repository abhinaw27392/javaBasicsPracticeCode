package com.java.basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class NumberOfWords {

	public static void main(String[] args) {
		//count the number of words in a string using hashmap
		String str = "aaaa bbbb cccc dddd eeee aaaa dddd";
		HashMap<String, Integer> map = new HashMap();
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			if(map.containsKey(strArr[i])) {
				int count = map.get(strArr[i]);
				map.put(strArr[i], ++count);
			}
			else {
				map.put(strArr[i], 1);
			}
		}
		System.out.println(map);
		
		//iterate hashmap using while and adv for loop
		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next(); 
			System.out.println("key is: " + entry.getKey() + ", value: " + entry.getValue());
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
	}

}
