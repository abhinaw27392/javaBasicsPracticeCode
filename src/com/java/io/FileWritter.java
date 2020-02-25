package com.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritter {

	public static void main(String[] args) {
		String data = "Test data2";
	    try{
	    	File file = new File("E:/java_practice/testFile1.txt");
	    	file.createNewFile();
	      FileOutputStream out = new FileOutputStream("E:/java_practice/testFile2.txt");
	      out.write(data.getBytes());
	      out.close();
	    }
	    catch(IOException e) {
	      e.printStackTrace();
	    }

	}

}
