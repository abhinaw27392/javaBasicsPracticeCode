package com.java.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

	public static void main(String[] args) {
	      SimpleDateFormat fm = new SimpleDateFormat("d MMM y HH:mm");
	      String str = fm.format(new Date());
	      System.out.println(str);
	    }

}
