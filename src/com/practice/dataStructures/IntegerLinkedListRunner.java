package com.practice.dataStructures;

class IntegerNode {

	private Integer value;
	private IntegerNode next;

	public IntegerNode(Integer value) {
		super();
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public IntegerNode getNext() {
		return next;
	}

	public void setNext(IntegerNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return value.toString();
	}

}

class IntegerLinkedList {

	private IntegerNode head;

	//Four cases
	public void addToFront(Integer value) {
		System.out.println("Adding number: " + value);
		IntegerNode newNode = new IntegerNode(value);

		IntegerNode currentNode = head;
		IntegerNode previousNode = null;

		// Case 1: Adding first node to the list
		if (currentNode == null) {
			head = newNode;
			return;
		}

		// Case 2: Adding second node to the list
		if (currentNode.getNext() == null && currentNode.getValue() > value) {
			newNode.setNext(currentNode);
			head = newNode;
			return;
		}

		// Case 3: Adding node at its right position in the sorted list
		while (currentNode != null && currentNode.getValue() < value) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}

		if (previousNode != null) {
			previousNode.setNext(newNode);
		}

		// Case 4: Adding node at the front of the non-empty list
		if (currentNode != null) {
			if (currentNode == head) {
				head = newNode;
			}
			newNode.setNext(currentNode);
		}
	}

	public void addToSortedList(Integer value) {

		IntegerNode newNode = new IntegerNode(value);

		// Case 1: Adding first element in the list
		// Case 2: First element in the sorted list is greater than or equal to
		// the new value
		if (head == null || head.getValue() >= value) {
			newNode.setNext(head);
			head = newNode;
			return;
		}

		IntegerNode previousNode = head;
		IntegerNode currentNode = head.getNext();

		// Case 3: Traverse the list to find the correct insertion position
		while (currentNode != null && currentNode.getValue() < value) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}

		previousNode.setNext(newNode);
		newNode.setNext(currentNode);

	}

	public void printList() {
		IntegerNode currentNode = head;
		System.out.print("HEAD -> ");
		while (currentNode != null) {
			System.out.print(currentNode);
			System.out.print(" -> ");
			currentNode = currentNode.getNext();
		}
		System.out.println("null");
	}
}

public class IntegerLinkedListRunner {

	public static void main(String[] args) {

		IntegerLinkedList list = new IntegerLinkedList();

		/*list.addToFront(3);
		list.printList();
		list.addToFront(2);
		list.printList();
		list.addToFront(7);
		list.printList();
		list.addToFront(4);
		list.printList();
		list.addToFront(1);
		list.printList();*/
		
		list.addToSortedList(3);
		list.printList();
		list.addToSortedList(2);
		list.printList();
		list.addToSortedList(7);
		list.printList();
		list.addToSortedList(4);
		list.printList();
		list.addToSortedList(1);
		list.printList();
		list.addToSortedList(9);
		list.printList();
		
	}

}
