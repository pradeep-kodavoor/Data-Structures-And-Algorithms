package com.practice.algorithms;

/**
 * @author 734456
 *
 */
public class BubbleSortRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Array Declaration and initialization
		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };

		// Bubble Sort the array by dividing the array into sorted and unsorted
		// partition

		// Consider index of last element as the unsorted partition index of array
		// Loop until complete array is sorted
		// On completion of each iteration,
		// an element would be sorted and placed in correct position
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

			// Compare only elements that are un-sorted
			// Since i is compared against i+1 equal is not required
			for (int i = 0; i < lastUnsortedIndex; i++) {

				// Compare an element with next element
				// > - for Ascending order sorting
				// < - for Descending order sorting
				if (intArray[i] > intArray[i + 1]) {
					AlgorithmsHelper.swapArrayElements(intArray, i, i + 1);
				}
			}
		}
		AlgorithmsHelper.printArray(intArray);
	}
}
