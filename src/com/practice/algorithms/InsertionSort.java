package com.practice.algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			int i = 0;
			int newElement = intArray[firstUnsortedIndex];

			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];

			}

			intArray[i] = newElement;
		}

		AlgorithmsHelper.printArray(intArray);

	}



}
