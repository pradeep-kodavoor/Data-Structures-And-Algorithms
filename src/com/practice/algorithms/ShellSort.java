package com.practice.algorithms;

public class ShellSort {

	public static void main(String[] args) {
		// Array Declaration and initialization
		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };
		int shiftingCount = 0;

		// Initial gap value with length/2 i.e. 3
		// Decrement the gap by dividing by 2 after each iteration
		for (int gap = intArray.length / 2; gap > 0; gap = gap / 2) {

			// Insertion Sort implementation using gap values
			// Loop for traversing the array from left to right starting from
			// the gap valued index
			for (int i = gap; i < intArray.length; i++) {
				int j = i;
				int newElement = intArray[i];

				// Loop for traversing the array from right to left starting
				// from gap valued index
				while (j >= gap && intArray[j - gap] > newElement) {

					// Elements greater than new Element is shifted towards
					// right
					intArray[j] = intArray[j - gap];
					shiftingCount++;

					// For traversing based on gap value
					j = j - gap;
				}
				intArray[j] = newElement;
			}
			AlgorithmsHelper.printArray(intArray);
		}

		System.out.println("Result after shifting " + shiftingCount + " times");
		AlgorithmsHelper.printArray(intArray);
	}

}
