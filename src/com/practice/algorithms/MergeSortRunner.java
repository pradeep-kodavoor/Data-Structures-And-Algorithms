package com.practice.algorithms;

public class MergeSortRunner {


	public static void main(String[] args) {

		// Array Declaration and initialization
		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };
		mergeSort(intArray, 0, intArray.length);
		AlgorithmsHelper.printArray(intArray);

	}

	// Recurive method to merge and sort the array
	static void mergeSort(int[] input, int start, int end) {
		// Exit condition for recursion
		// Returns on reaching a single element array
		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);
	}

	private static void merge(int[] input, int start, int mid, int end) {

		// Optimization to skip merging
		// If last element in a left array is less than the first element in the
		// right array
		if (input[mid - 1] < input[mid]) {
			return;
		}

		// Pointing to first element of left array
		int i = start;

		// Pointing to first element of right array
		int j = mid;

		// Temp array to store sorted elements
		int[] temp = new int[end - start];

		// Index to determine the number of elements added to temp array.
		int tempIndex = 0;

		//20, 35, -15, 7, 55, 1, -22
		//i - 1 - 35, j - 2 -15
		//Traverse either left or right array completely
		while (i < mid && j < end) {
			
			//Insert element into temp array post comparison
			// If first element in a left array is less than first element in
			// right array
			// Element from left array is copied to temp array
			// Pointer is moved to second element of left array
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		// When one of either left or right array is traversed completely, loop
		// exits.

		// Left over elements from right array are considered to be in its
		// correct position in the input array
		// Ex: Left Array - {32 - 0,34 - 1} Right Array-{ 33 - 2,35- 3}
		// After 3 Iterations, Temp Array - {32,33,34}, i -2, j - 3
		// 3 elements from temp array would be copied to input array.
		// Fourth element remains unaltered since it is already in its correct
		// position

		// Left over elements from left array has to be copied to the end of
		// input array
		// Ex: Left Array - {32 - 0,35 - 1} Right Array-{ 33 - 2,34- 3}
		// After 3 Iterations, Temp Array - {32,33,34}, i -1, j - 4
		// 3 elements from temp array would be copied to input array.
		// Fourth element should copied to the end of array
		System.arraycopy(input, i, input, start + tempIndex, mid - i);

		//Copy all elements from temp array to the input array
		System.arraycopy(temp, 0, input, start, tempIndex);
		
		//System.arraycopy(srcArray,startIndexOfSrcArray,destArray,startIndexOfDestArray,numberOfElementsToBeCopied)

		// Prints array after each merge
		AlgorithmsHelper.printArray(input);
	}
}
