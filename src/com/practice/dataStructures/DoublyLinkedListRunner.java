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

	StudentNode head;
	StudentNode tail;

	public void insertNodeAtHead(Student student) {

		StudentNode newNode = new StudentNode(student);
		if (head != null) {
			newNode.setNext(head);
			head.setPrevious(newNode);
		} else if (head == null) {
			tail = newNode;
		}
		head = newNode;

	}

	public void insertNodeAtTail(Student student) {
		StudentNode newNode = new StudentNode(student);
		if (tail != null) {
			newNode.setPrevious(tail);
			tail.setNext(newNode);
		} else {
			head = newNode;
		}
		tail = newNode;
	}

	public void printList() {

		StudentNode currentNode = head;
		System.out.print("HEAD -> ");
		while (currentNode != null) {
			System.out.print(currentNode);
			System.out.print(" <=> ");
			currentNode = currentNode.getNext();
		}
		System.out.print(" <- TAIL");

	}

	public StudentNode removeAtHead() {
		StudentNode removedNode = head;

		head = removedNode.getNext();
		head.setPrevious(null);

		removedNode.setNext(null);
		removedNode.setPrevious(null);

		return removedNode;
	}

	public StudentNode removeAtTail() {
		StudentNode removedNode = tail;

		tail = removedNode.getPrevious();
		tail.setNext(null);

		removedNode.setNext(null);
		removedNode.setPrevious(null);

		return removedNode;
	}

}

public class DoublyLinkedListRunner {

	public static void main(String[] args) {

		Student nikitha = new Student(1, "Nikitha");
		Student nikhil = new Student(2, "Nikhil");
		Student sahana = new Student(3, "Sahana");
		Student shreya = new Student(4, "Shreya");

		DoublyLinkedList studentList = new DoublyLinkedList();
		studentList.insertNodeAtHead(nikhil);
		studentList.insertNodeAtHead(nikitha);

		studentList.printList();

		studentList.insertNodeAtTail(sahana);
		studentList.insertNodeAtTail(shreya);
		System.out.println();
		studentList.printList();

		System.out.println(studentList.removeAtHead());
		studentList.printList();
		System.out.println(studentList.removeAtTail());
		studentList.printList();
	}

}
