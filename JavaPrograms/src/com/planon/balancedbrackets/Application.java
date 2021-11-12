package com.planon.balancedbrackets;

import com.planon.balancedbrackets.findbalancedbrackets.BalancedBrackets;

public class Application {

	public static void main(String[] args) {
		BalancedBrackets b = new BalancedBrackets();
		b.checkbalance();
		System.out.println(b.printbalance());
	}
}
