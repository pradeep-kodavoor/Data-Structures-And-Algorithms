package com.practice.algorithms;

public class InsertionSortUsingRecursion {

	public static void main(String[] args) {

		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };

		insertionSort(intArray, intArray.length);

		AlgorithmsHelper.printArray(intArray);
	}

	private static void insertionSort(int[] input, int numOfItems) {
		
		if (numOfItems < 2) {
			return;
		}
		
		insertionSort(input,numOfItems-1);
		
		int newElement = input[numOfItems-1];
		int i = 0;
		for (i = numOfItems - 1; i > 0 && input[i - 1] > newElement; i--) {
			input[i] = input[i - 1];
		}
		input[i] = newElement;
		
		
	}

}
