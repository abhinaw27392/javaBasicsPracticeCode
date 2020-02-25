package com.java.basics;

public class ReplaceSpaceByTwenty {

	public static void main(String[] args) {
		String str = "abhi naw kumar";
		System.out.println(replaceSpaceByTwenty(str));
	}

	private static String replaceSpaceByTwenty(String str) {
		return str.replace(" ", "%20");
	}

}
