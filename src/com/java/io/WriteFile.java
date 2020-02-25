package com.java.io;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) {
		File file = new File("src/demo2.txt");
		BufferedWriter bwritter = null;
		System.out.println(file.exists());
		//override the file
		if(file.exists()) {
			try {
				bwritter = new BufferedWriter(new FileWriter(file));
				bwritter.write("hello what are you doing?");
				bwritter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//append lines
		if(file.exists()) {
			try {
				bwritter = new BufferedWriter(new FileWriter(file, true));
				bwritter.newLine();
				bwritter.write("append hello what are you doing?");
				bwritter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
