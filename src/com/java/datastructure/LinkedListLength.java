package com.java.datastructure;

public class LinkedListLength {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		
		System.out.println(list.getCount());
	}

}
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
	
}
class LinkedList {
	Node head;
	
	public void push(int data) {
		Node p = new Node(data);
		p.next = head;
		head = p;
	}
	public int getCount() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
}
