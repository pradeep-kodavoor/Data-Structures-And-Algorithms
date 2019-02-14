package com.practice.algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

			int i;
			int newElement = intArray[firstUnsortedIndex];

			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {

				intArray[i] = intArray[i - 1];

			}
			intArray[i] = newElement;
		}

		AlgorithmsHelper.printArray(intArray);

		insertionSort(intArray, 1);

	}

	private static void insertionSort(int[] intArray, int firstUnsortedIndex) {

		if (firstUnsortedIndex == intArray.length) {
			return;
		}

		int newElement = intArray[firstUnsortedIndex];

		shiftElements(intArray, firstUnsortedIndex, newElement);

		insertionSort(intArray, firstUnsortedIndex++);

	}

	private static void shiftElements(int[] intArray, int firstUnsortedIndex, int newElement) {
		
		

	}

}
