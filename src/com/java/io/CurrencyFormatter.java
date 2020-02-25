package com.java.io;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			double payment = scanner.nextDouble();
			scanner.close();
	
			NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
			NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
			NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
			NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	
			System.out.println("US: " + nf1.format(payment));
			System.out.println("India: " + nf2.format(payment));
			System.out.println("China: " + nf3.format(payment));
			System.out.println("France: " + nf4.format(payment));
		}
}
