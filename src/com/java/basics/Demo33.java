package com.java.basics;

public class Demo33 {
	String name;
	String namo ;
	Demo33() {
//		System.out.println("hello");
		name = "abhinaw";
		namo = "modi" ;
	}

	public static void main(String[] args) {
		Demo33 d1;
		Demo33 d = new Demo33();
		System.out.println(d.toString());

	}
	public String toString() {
		return this.name;
	}

}
