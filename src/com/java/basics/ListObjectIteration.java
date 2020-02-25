package com.java.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListObjectIteration {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		Map<String, List<Object>> map = new HashMap<>();
		for(int i = 0; i < 5;i++) {
			list = new ArrayList<>(); 
			list.add("aaa" + i);
			list.add("bbbb" + i);
			list.add("cccc" + i);
			list.add("dddd" + i);
			map.put("0" + i, list);
		}
		for (Map.Entry<String,List<Object>> entry : map.entrySet()) {	
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
            
		} 
		
	}

}
