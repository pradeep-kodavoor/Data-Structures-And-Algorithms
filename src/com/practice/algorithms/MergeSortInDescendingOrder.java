package com.practice.algorithms;

public class MergeSortInDescendingOrder {

	public static void main(String[] args) {
		// Array Declaration and initialization
		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };
		mergeSort(intArray, 0, intArray.length);
		AlgorithmsHelper.printArray(intArray);

	}

	private static void mergeSort(int[] input, int start, int end) {

		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;

		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);


	}

	private static void merge(int[] input, int start, int mid, int end) {

		/*
		 * if (input[mid - 1] > input[mid]) { return; }
		 */

		int i = start;
		int j = mid;

		int tempIndex = 0;
		int[] tempArray = new int[end - start];

		while (i < mid && j < end) {
			tempArray[tempIndex++] = input[i] < input[j] ? input[i++] : input[j++];
		}

		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(tempArray, 0, input, start, tempIndex);


	}

}
