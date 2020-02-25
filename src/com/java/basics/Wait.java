package com.java.basics;

public class Wait {

	public static void main(String[] args) {
		 System.out.println("wait is startting.......");
		 long start = System.currentTimeMillis();
         long end = start + 10 * 1000;	//10 sec waiting......
         while (System.currentTimeMillis() < end) {
           // run
         }
         System.out.println("wait is closing......");

	}

}

