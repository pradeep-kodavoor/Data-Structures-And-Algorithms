package com.practice.algorithms;

public class CountingSortRunner {

	public static void main(String[] args) {
		// Array Declaration and initialization
		int intArray[] = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
		countingSort(intArray, 1, 10);
		// AlgorithmsHelper.printArray(intArray);
		// intArray[0]++;
		AlgorithmsHelper.printArray(intArray);

	}

	private static void countingSort(int[] intArray, int min, int max) {

		// Create a count array based on the range provided
		int[] countArray = new int[max - min + 1];

		for (int element : intArray) {
			// Determine the position of element in Count Array and increment
			// its value
			countArray[element - min]++;
		}
		// Counter for setting values to intArray
		int j = 0;
		// Loop for traversing the count array
		for (int i = min; i < max; i++) {
			// Inner loop for traversing repeated elements in the array
			// i -> actual element value in int Array
			// i - min -> element value in count Array
			while (countArray[i - min] > 0) {
				intArray[j++] = i;
				// Decrement the count of a value post adding it to intArray
				countArray[i - min]--;

			}

		}

	}

}
