package com.practice.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {

	public static void main(String[] args) {
		Employee pradeep = new Employee(123, "Pradeep", "Kodavoor");
		Employee avinash = new Employee(124, "Avinash", "Sinha");

		List<Employee> employees = new ArrayList<>();

		employees.add(pradeep);
		employees.add(avinash);

		System.out.println(employees);

		employees.stream().forEach(System.out::println);

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
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
