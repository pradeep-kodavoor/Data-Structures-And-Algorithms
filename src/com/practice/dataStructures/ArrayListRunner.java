package com.practice.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
/*		Employee pradeep = new Employee(123, "Pradeep", "Kodavoor");
		Employee avinash = new Employee(124, "Avinash", "Sinha");
		
		Employee marut = new Employee(125, "Marut", "Kumar");

		employees.add(pradeep);
		employees.add(avinash);

		Employee avinash1 = new Employee(124, "Avinash", "Sinha");
		
		//By default contains method uses only objects reference to compare
		//If equals and hashCode() method is not overridden
		
		//Hence, if we pass the same reference it will return true
		System.out.println("List contains Avinash ?" + employees.contains(avinash1)); // Output - false
		
		//If we pass different reference with same data it returns false
		System.out.println("List contains Avinash ?" + employees.contains(avinash)); // Output - true
		System.out.println("List contains Marut ?" + employees.contains(marut)); // Output - false
*/
		employees.add(new Employee(123, "Pradeep", "Kodavoor"));
		employees.add(new Employee(124, "Avinash", "Sinha"));

		employees.stream().forEach(System.out::println);
		
		System.out.println("\nList after updating");
		employees.set(1, new Employee(125, "Marut", "Kumar"));

		employees.stream().forEach(System.out::println);
		
		System.out.println("\nList contains Avinash ? " + employees.contains(new Employee(124, "Avinash", "Sinha")));
		System.out.println("List contains Pradeep ? " + employees.contains(new Employee(123, "Pradeep", "Kodavoor")));

		// Explicit casting is not required is we pass the required array type
		// as argument
		Employee[] array = employees.toArray(new Employee[employees.size()]);
		System.out.println("\nPrinting employees array");
		for (Employee emp : array) {
			System.out.println(emp);
		}
		System.out.println("\nIndex of Marut ? " + employees.indexOf(new Employee(125, "Marut", "Kumar")));

	}

}

class Employee {

	private int id;
	private String firstName;
	private String lastName;

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (firstName == null ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + (lastName == null ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "[firstName=" + firstName + "]";
	}
}
