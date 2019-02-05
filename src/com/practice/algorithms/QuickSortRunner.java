package com.practice.algorithms;

public class QuickSortRunner {

	public static void main(String[] args) {
		int input[] = { 20, 35, -15, 7, 55, 1, -22 };
		quickSort(input, 0, input.length);
		AlgorithmsHelper.printArray(input);

	}

	private static void quickSort(int[] input, int start, int end) {

		// One element array is considered to be sorted
		 if(end-start<2){
			return;
		 }

		// Get the pivot index by partitioning the array into 2 halves
		int pivotIndex = partition(input, start, end);

		// Sorting the first half of the array
		quickSort(input, start, pivotIndex);

		// Sorting the second half of the array
		quickSort(input, pivotIndex + 1, end);

	}

	private static int partition(int[] input, int start, int end) {

		// Variable for traversing the array from left to right
		int i = start;

		// Variable for traversing the array from right to left
		int j = end;

		// Considering first element of the array as pivot
		int pivot = input[start];
		
		// Loop until i and j overlaps
		while(i<j) {

			// Start from end of the array and find an element that is less than
			// the pivot
			while (i < j && input[--j] >= pivot) {
				;
			}
			// Once an element less than the pivot is found move it the
			// front(left side) of the array
			// i - points to the start of the array
			if(i<j){
				input[i] = input[j];
			}
			
			// Similarly start from start of the array and find an element that
			// is greater than the pivot
			while (i < j && input[++i] <= pivot) {
				;
			}
			// Once an element greater than the pivot is found move it the
			// end(right side) of the array
			if(i<j){
				input[j] = input[i];
			}
		}
		// If i overlaps j , it means all the element to the left of j is less
		// than pivot and all element to the right of j is greater than pivot.
		// Hence j is a pivotal Index
		input[j] = pivot;

		return j;
	}

}
