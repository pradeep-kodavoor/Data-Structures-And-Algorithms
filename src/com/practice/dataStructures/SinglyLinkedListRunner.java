package com.practice.dataStructures;

class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;

	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return employee.toString();
	}

}

class EmployeeLinkedList {

	private EmployeeNode head;
	private int size;

	public int getSize() {
		return size;
	}

	public void addToFront(Employee employee) {
		EmployeeNode newNode = new EmployeeNode(employee);
		if (head != null) {
			newNode.setNext(head);
		}
		head = newNode;
		size++;
	}

	public void printList() {
		EmployeeNode tempNode = head;
		System.out.print("HEAD -> ");
		while (tempNode != null) {
			System.out.print(tempNode);
			System.out.print(" -> ");
			tempNode = tempNode.getNext();

		}

	}

	public boolean isEmptyList() {

		return head == null;
	}

	public EmployeeNode deleteAtFront() {

		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;

	}

}

public class SinglyLinkedListRunner {

	public static void main(String[] args) {

		EmployeeLinkedList employeeList = new EmployeeLinkedList();

		employeeList.addToFront(new Employee(123, "Pradeep", "Kodavoor"));
		employeeList.addToFront(new Employee(124, "Avinash", "Sinha"));
		employeeList.addToFront(new Employee(125, "Marut", "Kumar"));

		employeeList.printList();
		System.out.println("\nSize of List: " + employeeList.getSize());

		System.out.println("\nDelete at front: " + employeeList.deleteAtFront());
		System.out.println("Size of List: " + employeeList.getSize());
		System.out.println("Is Empty List?  " + employeeList.isEmptyList());

		System.out.println("\nDelete at front: " + employeeList.deleteAtFront());
		System.out.println("Size of List: " + employeeList.getSize());
		System.out.println("Is Empty List?  " + employeeList.isEmptyList());

		System.out.println("\nDelete at front: " + employeeList.deleteAtFront());
		System.out.println("Size of List: " + employeeList.getSize());
		System.out.println("Is Empty List?  " + employeeList.isEmptyList());
	}

}
