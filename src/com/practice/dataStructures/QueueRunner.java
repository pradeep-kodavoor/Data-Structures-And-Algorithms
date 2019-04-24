package com.practice.dataStructures;

import java.util.Arrays;

class ArrayQueue {

	private int front;
	private int back;

	private Employee[] queue;
	
	public Employee[] getQueue() {
		return queue;
	}

	ArrayQueue(int capacity){
		queue = new Employee[capacity];
	}

	public void enqueue(Employee data) {
		if(back == queue.length-1){
			System.out.println("OOPS!! Array seems to be full!! Resizing the Array..");
			Employee[] newQueue = new Employee[queue.length*2];
			System.arraycopy(queue, 0, newQueue, 0, queue.length);
			queue = newQueue;
		}
		queue[back++] = data;
	}

	public Employee dequeue() {
		Employee itemToBeRemoved = queue[front];
		queue[front] = null;
		front++;
		return itemToBeRemoved;
	}

	public Employee peek(){
		return queue[front];
	}
	
	public int size() {
		return back - front;
	}

	public void printQueue() {
		System.out.print("Data in Queue -> ");
		for (int i=front;i<back;i++){
			System.out.print(queue[i]+" ");
		}
		System.out.println();
		System.out.print("Data in Array -> ");
		for (int i=0;i<queue.length;i++){
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "ArrayQueue [front=" + front + ", back=" + back + ", queue=" + Arrays.toString(queue) + "]";
	}
	
}

public class QueueRunner {

	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(4);
		Employee pradeep = new Employee(123, "Pradeep", "Kodavoor");
		Employee avinash = new Employee(124, "Avinash", "Sinha");
		Employee marut = new Employee(125, "Marut", "Kumar");
		Employee jagath = new Employee(126, "Jagath", "Devadiga");
		Employee nithin = new Employee(127, "Nithin", "Kumar");
		
		System.out.println("Enqueue Pradeep");
		queue.enqueue(pradeep);
		queue.printQueue();
		System.out.println("Enqueue Avinash");
		queue.enqueue(avinash);
		queue.printQueue();
		System.out.println("Enqueue Marut");
		queue.enqueue(marut);
		queue.printQueue();
		
		System.out.println("Peek: "+queue.peek());
		System.out.println("Dequeue: "+queue.dequeue());
		queue.printQueue();		
		System.out.println("Peek: "+queue.peek());
		System.out.println("Enqueue Nithin");
		queue.enqueue(nithin);
		queue.printQueue();
		System.out.println("Enqueue Jagath");
		queue.enqueue(jagath);

		System.out.println("Peek: "+queue.peek());
		
		queue.printQueue();
		
		System.out.println("Dequeue: "+queue.dequeue());
		
		System.out.println("Dequeue: "+queue.dequeue());
		
		System.out.println("Peek: "+queue.peek());
		
		queue.printQueue();
	}

}
