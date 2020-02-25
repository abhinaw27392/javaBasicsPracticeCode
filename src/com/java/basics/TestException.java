package com.java.basics;

class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;

	public CustomException(int id) {
		this.id = id;
	}

	public String toString() {
		return "customException" + "[" + id + "]";
	}
}

public class TestException {

	public static void main(String[] args) {
		TestException exp = new TestException();
		try {
			exp.getIntValue(5);
			exp.getIntValue(15);
		} catch (CustomException c) {
			System.out.println("exception is: " + c);
		}
	}

	public int getIntValue(int value) throws CustomException {
		if (value > 10) {
			throw new CustomException(value);
		} else {
			System.out.println("value is: " + value);
		}
		return value;
	}

}
