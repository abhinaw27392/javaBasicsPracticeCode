package com.java.io;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		File file = new File("src/demo.txt");
		System.out.println("Path : " + file.getAbsolutePath());

	}

}
