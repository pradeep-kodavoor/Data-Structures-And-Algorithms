package com.practice.algorithms;

/**
 * @author 734456
 *
 */
public class InsertionSortRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Array Declaration and initialization
		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };
		int iterationCount = 0;
		int shiftingCount = 0;

		// Assuming that element at index 0 is sorted, so start the loop from 1.
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			iterationCount++;
			System.out.println("Iteration: " + firstUnsortedIndex);
			// Save the value of element we are going to insert
			int newElement = intArray[firstUnsortedIndex];

			int i;

			// Keep looking for insertion position till we hit the front of the
			// array and element in the sorted position is greater the element
			// to be inserted
			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				iterationCount++;
				// Shifting the elements towards right side
				System.out.println("Shifting elements towards right");
				intArray[i] = intArray[i - 1];
				shiftingCount++;
				AlgorithmsHelper.printArray(intArray);

			}
			// If front of array is reached, insert new element at the front
			// If we find an element which is less than new element, break the
			// loop and insert new element next to it.
			intArray[i] = newElement;
			System.out.println("Order of elements in array after iteration:" + firstUnsortedIndex);
			AlgorithmsHelper.printArray(intArray);
		}
		System.out.println("Result after " + iterationCount + " iterations and shifting " + shiftingCount + " times");
		AlgorithmsHelper.printArray(intArray);
	}
}
