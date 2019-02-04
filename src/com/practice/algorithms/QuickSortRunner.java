package com.practice.algorithms;

public class QuickSortRunner {

	public static void main(String[] args) {
		int input[] = { 20, 35, -15, 7, 55, 1, -22 };
		quickSort(input, 0, input.length);
		AlgorithmsHelper.printArray(input);

	}

	private static void quickSort(int[] input, int start, int end) {
		 if(end-start<2){
			return;
		 }

		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);

	}

	private static int partition(int[] input, int start, int end) {

		int i = start;
		int j = end;
		int pivot = input[start];
		
		while(i<j) {
			while (i < j && input[--j] >= pivot) {
				;
			}
			if(i<j){
				input[i] = input[j];
			}
			
			while (i < j && input[++i] <= pivot) {
				;
			}
			if(i<j){
				input[j] = input[i];
			}
		}
		
		input[j] = pivot;

		return j;
	}

}
