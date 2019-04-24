package com.practice.dataStructures;

import java.util.NoSuchElementException;

class CircularQueue {

	private Employee[] queue;
	private int front;
	private int back;

	public CircularQueue(int capacity) {
		queue = new Employee[capacity];

	}

	public void enqueue(Employee data) {
		
		if (size() == queue.length - 1) {
			int numberOfItems = size();
			Employee[] newQueue = new Employee[queue.length * 2];
			System.arraycopy(queue, front, newQueue, 0, queue.length - front);
			System.arraycopy(queue, 0, newQueue, queue.length - front, back);

			queue = newQueue;

			front = 0;
			back = numberOfItems;

		}

		queue[back] = data;

		if (back < queue.length - 1) {
			back++;
		} else {
			back = 0;
		}

	}

	public Employee dequeue() {

		if (size() == 0) {
			throw new NoSuchElementException();
		}

		Employee itemToBeRemoved = queue[front];
		queue[front] = null;
		front++;

		if (size() == 0) {
			front = 0;
			back = 0;
		}

		return itemToBeRemoved;
	}
	
	public int size() {
		return queue.length;
	}

	public void printQueue() {
		System.out.print("Items in the queue -> ");
		if (front <= back) {
			for (int i = front; i < queue.length; i++) {
				System.out.print(queue[i] + " ");
			}
		} else {
			for (int i = front; i < queue.length; i++) {
				System.out.print(queue[i] + " ");
			}
			for (int i = 0; i < front; i++) {
				System.out.print(queue[i] + " ");
			}
		}

		System.out.println();

	}

}

public class CircularQueueRunner {

	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(5);
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));
		System.out.println("Dequeue " + queue.dequeue());
		queue.enqueue(new Employee(1, "Arya", "Stark"));

		queue.printQueue();
		System.out.println(queue);

	}

}
