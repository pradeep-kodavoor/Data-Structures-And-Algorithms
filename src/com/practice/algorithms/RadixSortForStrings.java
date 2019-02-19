package com.practice.algorithms;

/**
 * @author 734456
 *
 */
public class RadixSortForStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] stringArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };

		radixSort(stringArray, 26, 5);

		AlgorithmsHelper.printArray(stringArray);

	}

	/**
	 * @param stringArray
	 * @param radix
	 * @param width
	 */
	private static void radixSort(String[] stringArray, int radix, int width) {
		
		for (int i = width - 1; i >= 0; i--) {
			radixSingleSort(stringArray, i, radix);
		}

	}

	/**
	 * @param stringArray
	 * @param position
	 * @param radix
	 */
	private static void radixSingleSort(String[] stringArray, int position, int radix) {

		int[] countArray = new int[radix];

		// Initialize count array
		for(String str: stringArray){
			countArray[getLetter(str, position)]++;
		}

		// Adjust count array
		for (int i = 1; i < radix; i++) {
			countArray[i] += countArray[i - 1];
		}

		int numOfItems = stringArray.length;

		String[] tempArray = new String[numOfItems];

		for (int tempIndex = numOfItems - 1; tempIndex >= 0; tempIndex--) {
			tempArray[--countArray[getLetter(stringArray[tempIndex], position)]] = stringArray[tempIndex];
		}

		System.arraycopy(tempArray, 0, stringArray, 0, numOfItems);

	}

	/**
	 * @param str
	 * @param position
	 * @return char at specified position
	 */
	private static int getLetter(String str, int position) {
		return str.charAt(position) - 'a';
	}

}
