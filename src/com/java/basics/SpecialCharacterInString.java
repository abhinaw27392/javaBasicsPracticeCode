package com.java.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacterInString {

	public static void main(String[] args) {
		String fileName = "abc?jhf.jpeg";
		System.out.println("FileName is: "+ fileName);
		
		Pattern pattern = Pattern.compile("[\\w]*[/%.\\\\<>\"|?*:]+[\\w]*[.]{1}[A-Za-z]+$");
        Matcher matcher = pattern.matcher(fileName);
        
        if(matcher.find()) {
        	String str = "Your file " + fileName + " cannot be processed, as it has  special character (/ \\ ? % . * : | \" < >) in its filename."
        			+ " Please rename your file and proceed uploading.";
        	System.out.println(str);
        }
		else
			System.out.println("ok");
	}
}
