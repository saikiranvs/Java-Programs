package com.planon.primenumber.findprime;

public class FindPrime {
	private long number;
	private int count = 0;

	/**
	 * @param aNumber accepts an integer value.
	 */
	public FindPrime(long aNumber) {
		this.number = aNumber;
	}

	public long findPrime() {
		if (number == 0 && number == 1) {
			return number;

		} else if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					count++;
					break;
				}
			}

		}
		if (count > 0) {
			return 0;
		} else {
			return number;
		}
	}

}
