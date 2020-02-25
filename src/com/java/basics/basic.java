package com.java.basics;

import java.io.File;

public class basic {
	static String str = "mhvjhjhvjhv\7777777n\nhjfjgdhgdhg";
	public static void main(String[] args) {
		String[] strArr = str.split("\n");
		for(String strNew: strArr) {
		System.out.println(strNew);	
		}
		File file = new File("src/demo.txt");
		System.out.println("Path : " + file.getAbsolutePath());
		
	}

}
