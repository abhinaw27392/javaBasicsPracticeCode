package com.java.basics;

public class SearchInLinkedList {
	Node head;
	Node tail;

	public void add(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
	}

	public static boolean search(Node head, int data) {
		Node current = head;
		while (current != null) {
			if (current.data == data)
				return true;
			current = current.next;
		}
		return false;
	}
	
	public void printValue(Node head) {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		SearchInLinkedList llist = new SearchInLinkedList();
		llist.add(11);
		llist.add(12);
		llist.add(13);
		llist.add(14);
		llist.add(15);
		llist.add(16);

		llist.printValue(llist.head);
		if (SearchInLinkedList.search(llist.head, 15)) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}

}

class Node {
	int data;
	Node next;

	Node(int d) {
		this.data = d;
		this.next = null;
	}
}
