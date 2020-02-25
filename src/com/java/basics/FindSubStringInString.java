package com.java.basics;

import java.util.Scanner;

public class FindSubStringInString {

	public static void main(String[] args) {
		
		byte b = 10; 
	    b++; 
	    System.out.println(((Object)b).getClass().getName()); 
	    
		System.out.print("Enter a string: ");
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.nextLine();

		System.out.print("Enter sub string: ");
		Scanner sc2 = new Scanner(System.in);
		String subStr = sc2.nextLine();
		
		System.out.println(isSubStringExist(str, subStr));
	}

	private static boolean isSubStringExist(String str, String subStr) {
		if(str.indexOf(subStr) >= 0)
			return true;
		else
			return false;
		
	}

}
