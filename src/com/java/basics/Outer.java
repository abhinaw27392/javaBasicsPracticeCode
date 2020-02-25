package com.java.basics;

public class Outer {
	private static int data = 10;

	public String demo() {
		return "demo is executing..";
	}

	public static String demo2() {
		return "demo2 is executing..";
	}

	// inner class
	private class InnerClass {
		public void myMethod() {
			// it can access all methods and fields of outer class.
			System.out.println("inner class method is executing: " + data + demo() + demo2());
		}
	}

	// static nested class
	static class InnerClass2 {
		public void myMethod2() {
			// it can only access Outer static members i.e, static methods and static fields
			System.out.println("static nested class method is executing.." + demo2() + data);
		}
	}

	public static void main(String[] args) {
		// inner class instantiation
		Outer.InnerClass inr = new Outer().new InnerClass();
		inr.myMethod();

		// static nested class instantiation
		Outer.InnerClass2 inr2 = new Outer.InnerClass2();
		inr2.myMethod2();
	}

}
