package com.practice.algorithms;

/**
 * @author 734456
 *
 */
public class AlgorithmsHelper {
	/**
	 * @param intArray
	 * @param x
	 * @param y
	 */
	static void swapArrayElements(int[] intArray, int x, int y) {
		int temp = intArray[x];
		intArray[x] = intArray[y];
		intArray[y] = temp;
	}

	/**
	 * @param intArray
	 */
	static void printArray(int[] intArray) {
		for (int element : intArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
