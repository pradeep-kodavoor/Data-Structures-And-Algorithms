package com.practice.algorithms;

public class MergSort {

	public static void main(String[] args) {
		int input[] = { 20, 35, -15, 7, 55, 1, -22 };
		mergeSort(input, 0, input.length);
		AlgorithmsHelper.printArray(input);

	}

	private static void mergeSort(int[] input, int start, int end) {

		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;

		// Left partition
		mergeSort(input, start, mid);

		// Right partition
		mergeSort(input, mid, end);

		// Merging left and right arrays
		merge(input, start, mid, end);

	}

	private static void merge(int[] input, int start, int mid, int end) {

		if (input[mid - 1] < input[mid]) {
			return;
		}

		int i = start;
		int j = mid;

		int tempIndex = 0;
		int[] tempArray = new int[end - start];

		while (i < mid && j < end) {
			tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}

		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(tempArray, 0, input, start, tempIndex);
	}

}
