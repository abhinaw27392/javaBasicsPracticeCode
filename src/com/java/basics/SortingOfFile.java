package com.java.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortingOfFile {

	public static void main(String[] args) {

		BufferedReader reader = null;
		BufferedWriter writer = null;
		ArrayList<String> list = new ArrayList<>();
		try {
			reader = new BufferedReader(new FileReader("src/input"));
			String readLine = reader.readLine();
			while (readLine != null) {
				list.add(readLine);
				readLine = reader.readLine();
			}
			Collections.sort(list);
			writer = new BufferedWriter(new FileWriter("src/output"));
			for (String line : list) {
				writer.write(line);
				writer.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
