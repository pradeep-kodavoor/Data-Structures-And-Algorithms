package com.practice.dataStructures;

public class ArraysRunner {

	public static void main(String[] args) {

		// Array Declaration and initialization
		int intArray[] = new int[7];

		// Printing the default initialized array
		for (int num : intArray) {
			System.out.print(num + " ");
		}
		// Prints 0 0 0 0 0 0 0

		//Adding elements to an Array
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;

		//Printing the array with new elements
		System.out.println();
		for (int element : intArray) {
			System.out.print(element + " ");
		}
		// Prints 20 35 -15 7 55 1 -22
		
		//Search for an element in an Array
		System.out.println();
		int index = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 7) {
				index = i;
			}
		}
		System.out.println("Element 7 is at position: " + index);
	}

}
