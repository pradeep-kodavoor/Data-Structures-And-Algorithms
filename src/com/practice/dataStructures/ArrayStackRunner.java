package com.practice.dataStructures;

import java.util.EmptyStackException;

class Book {
	private int id;
	private String name;

	public Book(int id, String name) {
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
		return "Book [id=" + id + ", name=" + name + "]";
	}
}

class ArrayStack {

	private Book[] stack;
	private int top;

	public ArrayStack(int capacity) {
		super();
		this.stack = new Book[capacity];
	}

	public void push(Book book) {

		// Resizing the array when it is full
		if (stack.length == top) {
			Book[] newArray = new Book[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}

		stack[top++] = book;

	}

	public Book pop() {
		
		if(size() == 0){
			throw new EmptyStackException();
		}
		
		return stack[--top];
		
	}

	public Book peek() {
		if (size() == 0) {
			throw new EmptyStackException();
		}

		return stack[top - 1];
	}

	public int size() {
		return top;
	}

	public void printStack() {
		System.out.println("--Stack--");
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}

public class ArrayStackRunner {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(5);

		stack.push(new Book(1, "Effective Java"));
		stack.push(new Book(2, "Clean code"));
		stack.push(new Book(3, "Java for dummies"));

		stack.printStack();

		System.out.println("Pop: " + stack.pop());
		stack.printStack();
		System.out.println("Peek: " + stack.peek());

	}

}
