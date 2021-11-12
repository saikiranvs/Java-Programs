package com.planon.balancedbrackets.findbalancedbrackets;

import java.util.Scanner;

public class BalancedBrackets {
	public static int count = 0;
	public String text = "";

	public void checkbalance() {
		Scanner sc = new Scanner(System.in);
		text = sc.nextLine();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '<') {
				count++;
			} else if (text.charAt(i) == '>') {
				if (count > 0) {
					count--;
				} else {
					count = 1;
					break;
				}

			} // end of if statement
		} // end of for loop
	}

	/*
	 * text.charAt() holds the current character of the string. count increments its
	 * value if expression contains opening brackes and decrements its value if it
	 * contains closing brackets and if closing brackets are more than opening then
	 * it assigns count value as 1 i.e the expression is not valid
	 */
	public String printbalance() {
		if (count == 0) {
			return text;
		} else {
			return null;
		}
	}
	/*
	 * printbalance() checks whether the brackets are equal and valid(closing
	 * bracket never comes before opening bracket) and returns string else it will
	 * return null value
	 */
}
