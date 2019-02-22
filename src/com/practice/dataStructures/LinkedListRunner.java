package com.practice.dataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedList<Employee> list = new LinkedList<>();

		list.addFirst(new Employee(123, "Pradeep", "Kodavoor"));
		list.addFirst(new Employee(124, "Avinash", "Sinha"));
		list.addFirst(new Employee(125, "Marut", "Kumar"));

		printList(list);

		list.addLast(new Employee(126, "Nithin", "Kumar"));
		printList(list);
		System.out.println(list.removeFirst());
		printList(list);
		System.out.println(list.removeLast());
		printList(list);

	}

	private static void printList(LinkedList<Employee> list) {
		Iterator<Employee> iterator = list.iterator();

		System.out.print("HEAD -> ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" <=> ");
		}
		System.out.println(" <- TAIL");
	}

}
