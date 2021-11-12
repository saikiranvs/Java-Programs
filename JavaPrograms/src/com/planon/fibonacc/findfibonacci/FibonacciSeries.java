package com.planon.fibonacc.findfibonacci;

import java.util.Scanner;

/* It is a series of numbers in which each number is the sum of the two preceding numbers.*/
public class FibonacciSeries {
	public int first = 0, second = 1, third = 0;

	public void PrintFibonacciSeries() {
		System.out.print("Enter the length of fibonacci series : ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		if (value == 1) {
			System.out.print(first);
		} else if (value == 2) {
			System.out.print(first + " " + second);
		} else {
			System.out.print(first + " " + second);

			for (int i = 2; i < value; i++) {
				third = first + second;
				first = second;
				second = third;
				System.out.print(" " + third);
			} // end of for loop
		} // end of if statement
	}
	/*
	 * this function prints the series of fibonacci numbers upto the length of the
	 * value scanner class accepts from the user.
	 */
}
