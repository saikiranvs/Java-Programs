package com.planon.primenumber;

import com.planon.primenumber.findprime.FindPrime;

public class Application {

	public static void main(String[] args) {
		FindPrime prime = new FindPrime(1013);
		System.out.println(prime.findPrime());
	}

}