package com.java.basics;

public class DeadLockInJava {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread2());
		t1.start();
		t2.start();
	}

}

class MyThread1 implements Runnable {
	public void run() {

		synchronized (String.class) {
			System.out.println("Thread 1 locked string1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (Integer.class) {
				System.out.println("Thread 1 locked Integer1");
			}
		}
	}
}

class MyThread2 implements Runnable {
	public void run() {
		synchronized (Integer.class) {
			System.out.println("Thread 2 locked Integer2");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out.println("Thread 2 locked string2");
			}
		}

	}
}
