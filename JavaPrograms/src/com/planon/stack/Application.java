package com.planon.stack;

import com.planon.stack.stackimplementation.Stack;

public class Application {

	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.push("book1");
		s.push("book2");
		s.push("book3");
		s.push("book4");
		s.display();
		s.pop();
		s.pop();
		s.display();
	}
}
