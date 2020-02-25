package com.java.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		File file = new File("src/demo.txt");
		System.out.println("Path : " + file.getAbsolutePath());
////		##########for creating new file ###########
////		File file44 = new File("src/demo44.txt");
////		try {
////			file44.createNewFile();
////		} catch (IOException e1) {
////			e1.printStackTrace();
////		}
////		-----------------------------------
		BufferedReader br = null;
		FileInputStream ins = null;
		
		//using bufferedReader and FileReader
		if(file.exists()) {
			try {
				br = new BufferedReader(new FileReader(file));
				String str;
				while((str = br.readLine())!= null) {
					System.out.println(str);
				}	
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//using FileInputStream
		if(file.exists()) {
			try {
				ins = new FileInputStream(file);
				int i;
				while((i = ins.read())!= -1) {
					System.out.print((char)i);
				}	
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

}

}
