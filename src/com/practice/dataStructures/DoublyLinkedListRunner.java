package com.practice.dataStructures;

class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

class StudentNode {

	private Student student;
	private StudentNode previous;
	private StudentNode next;

	public StudentNode(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentNode getPrevious() {
		return previous;
	}

	public void setPrevious(StudentNode previous) {
		this.previous = previous;
	}

	public StudentNode getNext() {
		return next;
	}

	public void setNext(StudentNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return student.toString();
	}

}

class DoublyLinkedList {

	private StudentNode head;
	private StudentNode tail;
	private int size;

	public void insertNodeAtHead(Student student) {

		StudentNode newNode = new StudentNode(student);
		// Check if new node is the first node in the list
		if (head != null) {
			newNode.setNext(head);
			head.setPrevious(newNode);
		} else if (head == null) {
			tail = newNode;
		}
		head = newNode;
		size++;

	}

	public void insertNodeAtTail(Student student) {
		StudentNode newNode = new StudentNode(student);
		// Check if new node is the first node in the list
		if (tail != null) {
			newNode.setPrevious(tail);
			tail.setNext(newNode);
		} else {
			head = newNode;
		}
		tail = newNode;
		size++;
	}

	public void printList() {

		StudentNode currentNode = head;
		System.out.print("\nHEAD -> ");
		while (currentNode != null) {
			System.out.print(currentNode);
			System.out.print(" <=> ");
			currentNode = currentNode.getNext();
		}
		System.out.print(" <- TAIL\n");

	}

	public StudentNode removeAtHead() {
		if (isEmpty()) {
			return null;
		}

		StudentNode removedNode = head;

		// Check if removed node is the last node in the list
		if(removedNode.getNext() == null){
			tail = null;
			head = null;
		} else {
			head = removedNode.getNext();
			head.setPrevious(null);
		}
		
		removedNode.setNext(null);
		size--;
		return removedNode;

	}

	public StudentNode removeAtTail() {
		if (isEmpty()) {
			return null;
		}

		StudentNode removedNode = tail;

		// Check if removed node is the last node in the list
		if (removedNode.getPrevious() == null) {
			head = null;
			tail = null;
		} else {
			tail = removedNode.getPrevious();
			tail.setNext(null);
		}

		removedNode.setPrevious(null);
		size--;
		return removedNode;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getSize() {
		return size;
	}

	public boolean addBefore(Student newStudent, Student existingStudent) {

		if (isEmpty()) {
			return false;
		}


		StudentNode currentNode = head;

		// Search for the existing node
		while (currentNode != null && !currentNode.getStudent().equals(existingStudent)) {
			currentNode = currentNode.getNext();
		}
		// Check if search is successful
		if (currentNode == null) {
			return false;
		}
		StudentNode newNode = new StudentNode(newStudent);
		StudentNode previousNode = currentNode.getPrevious();

		newNode.setNext(currentNode);
		currentNode.setPrevious(newNode);

		// Check if existing node is head node
		if (currentNode == head) {
			head = newNode;
		} else {
			previousNode.setNext(newNode);
			newNode.setPrevious(previousNode);
		}

		return true;

	}

}

public class DoublyLinkedListRunner {

	public static void main(String[] args) {

		Student nikitha = new Student(1, "Nikitha");
		Student nikhil = new Student(2, "Nikhil");
		Student sahana = new Student(3, "Sahana");
		Student shreya = new Student(4, "Shreya");
		Student likith = new Student(5, "Likith");

		DoublyLinkedList studentList = new DoublyLinkedList();

		studentList.insertNodeAtHead(nikhil);

		studentList.printList();

		studentList.insertNodeAtHead(nikitha);

		studentList.printList();

		studentList.insertNodeAtTail(sahana);

		studentList.printList();

		studentList.insertNodeAtTail(shreya);

		studentList.printList();

		System.out.println("\n Removed Node: " + studentList.removeAtHead());

		studentList.printList();

		System.out.println("\n Removed Node: " + studentList.removeAtTail());

		studentList.printList();
		
		System.out.println("\n Add Node likith before sahana: " + studentList.addBefore(likith, sahana));

		studentList.printList();

		System.out.println("\n Add Node nikitha before shreya: " + studentList.addBefore(nikitha, shreya));

		System.out.println("\n Add Node shreya before nikhil: " + studentList.addBefore(shreya, nikhil));

		studentList.printList();

	}

}
