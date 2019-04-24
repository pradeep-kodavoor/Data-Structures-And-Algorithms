package com.practice.dataStructures;

import java.util.Arrays;
import java.util.NoSuchElementException;

class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;

	ArrayQueue(int size) {
		queue = new Employee[size];
	}

	public void enqueue(Employee data) {
		if (back == queue.length) {
			Employee[] newQueue = new Employee[queue.length * 2];
			System.arraycopy(queue, 0, newQueue, 0, queue.length);
			queue = newQueue;
		}
		queue[back++] = data;
	}

	public Employee dequeue() {

		if (size() == 0) {
			throw new NoSuchElementException();
		}

		Employee itemRemoved = queue[front];
		queue[front] = null;
		front++;

		if (size() == 0) {
			front = 0;
			back = 0;
		}

		return itemRemoved;
	}

	public Employee peek() {
		return queue[front];
	}

	public int size() {
		return back - front;
	}

	public void printQueue() {
		System.out.print("Items in the queue -> ");
		for (int i = front; i < back; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "ArrayQueue [queue=" + Arrays.toString(queue) + ", front=" + front + ", back=" + back + "]";
	}
}

public class QueueRunner {

	public static void main(String[] args) {

		ArrayQueue queue = new ArrayQueue(5);
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

		// queue.enqueue(new Employee(2, "Bran", "Stark"));
		// queue.enqueue(new Employee(3, "Sansa", "Stark"));
		// queue.enqueue(new Employee(4, "John", "Snow"));
		// queue.enqueue(new Employee(5, "Tyrion", "Lannister"));
		// queue.enqueue(new Employee(6, "Daenerys", "Targaryen"));
		queue.printQueue();
		System.out.println(queue);

		// queue.enqueue(new Employee(6, "Samuel", "Tully"));

		// System.out.println(queue);
		// queue.printQueue();

		// System.out.println("Dequeue " + queue.dequeue());
		// System.out.println("Dequeue " + queue.dequeue());
		// System.out.println("Dequeue " + queue.dequeue());

		// System.out.println(queue);
		// queue.printQueue();

		System.out.println("Peek " + queue.peek());

		System.out.println(queue);
		queue.printQueue();
		System.out.println("Queue Size: " + queue.size());
	}

}
