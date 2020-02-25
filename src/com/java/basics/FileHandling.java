package com.java.basics;

import java.io.*;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		File file = new File("E:\\CMT\\workspace\\basics\\src\\com\\java\\basics\\test.txt");
		File fileout = new File("E:\\CMT\\workspace\\basics\\src\\com\\java\\basics\\out.txt");

		if (file.isFile()) {
			try {
				fin = new FileInputStream(file);
				fout = new FileOutputStream(fileout);
				
				int i = 0;

				while ((i = fin.read()) != -1) {
					fout.write(i);
					System.out.print((char) i);
				}

				System.out.println();
				System.out.println(file.getAbsolutePath());
				fin.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("not file");
		}

	}

}
