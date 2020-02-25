package com.java.basics;

public class ConstructorDemo {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.display();
//		Box b2 = new Box(10,5,6);
//		b2.display();
//		Box b3 = new Box(15);
//		b3.display();
//		SmallBox sb = new SmallBox();
//		sb.display2();
	}

}
class SuperBox {
	int length;
	int width;
	int height;
	SuperBox() {
		System.out.println("super class default constructor");
	}
	SuperBox(int l, int w, int h) {
		System.out.println("super class parameterised constructor");
		this.length = l;
		this.width = w;
		this.height = h;
	}
	
}
class Box extends SuperBox{
	
	Box() {
		this(11,12,13);
		System.out.println("current class default constructor");
	}
	Box(int l, int w, int h) {
		super(l,w,h);
		System.out.println("current class parameterized constructor");
	}
	Box(int n) {
		length = width = height = n;
		System.out.println("single parameter constructor");
	}
	
	void display() {
		System.out.println("["+ length + "," + width + "," + height +"]");
	}
}

class SmallBox extends Box {
	void display2() {
		System.out.println("["+ length + "," + width + "," + height +"]");
	}
	
}
