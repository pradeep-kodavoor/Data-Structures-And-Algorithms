package com.practice.algorithms;

/**
 * @author 734456
 *
 */
public class SelectionSortRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Array Declaration and initialization
		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };


		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			// Consider first element as the largest
			int largest = 0;

			// Since first element is considered as largest. Comparison starts
			// from second element.
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			// Swap the largest element with the last element of the unsorted
			// partition
			AlgorithmsHelper.swapArrayElements(intArray, largest, lastUnsortedIndex);
		}

		AlgorithmsHelper.printArray(intArray);

	}

}
