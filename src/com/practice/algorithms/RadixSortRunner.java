package com.practice.algorithms;

public class RadixSortRunner {

	public static void main(String[] args) {

		int[] intArray = { 4725, 4586, 1330, 8792, 1594, 5729 };

		radixSort(intArray, 10, 4);

		AlgorithmsHelper.printArray(intArray);
	}

	private static void radixSort(int[] input, int radix, int width) {

		// Loop for sorting on the basis of each digit starting from rightmost
		// digit
		for (int i = 0; i < width; i++) {
			radixSortByWidth(input, i, radix);
		}

	}

	private static void radixSortByWidth(int[] input, int position, int radix) {

		// Count array
		int[] countArray = new int[radix];

		for (int element : input) {
			countArray[getDigit(element, position, radix)]++;
		}

		// Adjust the count array
		for (int i = 1; i < radix; i++) {
			countArray[i] += countArray[i - 1];
		}
		
		int numOfItems = input.length;
		
		//Temp array
		int[] tempArray = new int[numOfItems];
		
		for (int tempIndex = numOfItems - 1; tempIndex >= 0; tempIndex--) {
			tempArray[--countArray[getDigit(input[tempIndex], position, radix)]] = input[tempIndex];
		}

		System.arraycopy(tempArray, 0, input, 0, numOfItems);

	}

	private static int getDigit(int value, int position, int radix) {
		return value / (int) Math.pow(radix, position) % radix;
	}

}
