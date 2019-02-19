package com.practice.algorithms;

public class RadixSort {

	public static void main(String[] args) {
		int[] intArray = { 4725, 4586, 1330, 8792, 1594, 5729 };

		radixSort(intArray, 10, 4);

		AlgorithmsHelper.printArray(intArray);

	}

	private static void radixSort(int[] input, int radix, int width) {

		// Sort each position starting from rightmost digit
		// Starting from 1's position
		for (int i = 0; i < width; i++) {
			radixSingleSort(input, i, radix);
		}

	}

	private static void radixSingleSort(int[] input, int position, int radix) {

		// Count array
		int[] countArray = new int[radix];

		// Initialize count array using values of input array
		for (int element : input) {
			countArray[getDigit(element, position, radix)]++;
		}

		// Adjust the count array
		//Adds up all the previous count to the current count
		//Gives us range of values that less than current digit
		for (int i = 1; i < radix; i++) {
			countArray[i] += countArray[i - 1];
		}
		
		int numOfItems = input.length;
		
		//Temp array
		int[] tempArray = new int[numOfItems];
		
		// Determine the position of each number in the temp array using count
		// array
		// Inserting the elements in backward order to ensure stability
		for (int tempIndex = numOfItems - 1; tempIndex >= 0; tempIndex--) {
			tempArray[--countArray[getDigit(input[tempIndex], position, radix)]] = input[tempIndex];
		}
		
		for(int tempIndex = 0 ; tempIndex< numOfItems;tempIndex++){
			input[tempIndex] = tempArray[tempIndex];
		}


	}

	// Method extracts each digit from a given number based on the position
	// provided
	// Starting from rightmost digit
	// Ex: 4725 , For Position - 0 , Output - 5, Position - 2 , Output - 7
	private static int getDigit(int value, int position, int radix) {
		return value / (int) Math.pow(radix, position) % radix;
	}

}
