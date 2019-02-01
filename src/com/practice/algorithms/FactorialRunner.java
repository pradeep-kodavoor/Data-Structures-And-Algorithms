package com.practice.algorithms;

public class FactorialRunner {

	public static void main(String[] args) {

		System.out.println("Factorial of -1: " + recursiveFactorial(-1));
		System.out.println("Factorial of 0: " + recursiveFactorial(0));
		System.out.println("Factorial of 1: " + recursiveFactorial(1));
		System.out.println("Factorial of 2: " + recursiveFactorial(2));
		System.out.println("Factorial of 3: " + recursiveFactorial(3));
		System.out.println("Factorial of 4: " + recursiveFactorial(4));
		System.out.println("Factorial of 5: " + recursiveFactorial(5));

		System.out.println("Factorial using For Loop of -1: " + iterativeFactorial(-1));
		System.out.println("Factorial of 0: " + iterativeFactorial(0));
		System.out.println("Factorial of 1: " + iterativeFactorial(1));
		System.out.println("Factorial of 2: " + iterativeFactorial(2));
		System.out.println("Factorial of 3: " + iterativeFactorial(3));
		System.out.println("Factorial of 4: " + iterativeFactorial(4));
		System.out.println("Factorial of 5: " + iterativeFactorial(5));

	}

	static int recursiveFactorial(int number) {
		if (number < 0) {
			return 0;
		}
		if (number == 0) {
			return 1;
		} else if (number == 1) {
			return 1;
		} else {
			return number * recursiveFactorial(number - 1);
		}

	}

	static int iterativeFactorial(int number) {

		int factorial = 1;
		
		if (number < 0) {
			return 0;
		}
		if (number == 0) {
			return 1;
		}
		for(int i = number; i>0 ; i--){
			factorial = factorial * i;
		}

		return factorial;
		
	}
}
