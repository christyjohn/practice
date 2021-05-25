package com.christy.linkedlist;

public class LinkedListApp {
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		printNodes(head);
		System.out.println();
		System.out.println("Printing nodes recursively");
		printNodesRecursively(head);
	}
	
	// traverse and print the nodes in the linked list
	// 10 - > 20 - > 30 - > 40 
	public static void printNodes(Node node) {
		Node curr = node;
		while (curr != null) {
			System.out.print(curr.data); 
			if (curr.next != null)
				System.out.print(" - > ");
			curr = curr.next;
		}
	}
	
	// recursively print the nodes of a linked list
	public static void printNodesRecursively(Node node) {
		Node curr = node;
		if (curr == null)
			return;
		else {
			System.out.print(node.data);
			if (curr.next != null)
				System.out.print(" - > ");
			printNodesRecursively(node.next);
		}
	}
}
