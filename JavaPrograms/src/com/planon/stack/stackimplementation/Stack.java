package com.planon.stack.stackimplementation;

/**
 * The Stack class represents a last-in-first-out (LIFO) stack of objects. The
 * push and pop operations are provided to push elements into the stack and to
 * pop elements out of the stack. When a stack is first created, it contains no
 * items.
 */
public class Stack {
	public static String[] stack;
	public int top = -1;
	public int value;

	/*
	 * stack is an array of type string top indicates as an index of the stack
	 */
	public Stack(int value) {
		this.value = value;
		stack = new String[value];
	}

	/* A constructor named stack accepts value to define the size of an array */
	public void push(String string) {

		if (top == value - 1) {
			return;
		} else {
			top++;
			stack[top] = string;
		}
	}

	/*
	 * Pushes an item onto the top of this stack.
	 * 
	 * @param string the item to be pushed onto this stack.
	 */
	public void pop() {
		if (top == -1) {
			return;
		} else {
			String string = stack[top];
			top--;
		}
	}

	/*
	 * Pops an item from the top of the stack.
	 * 
	 * @param string the item to be pop from the stack.
	 */
	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.println(stack[i]);
		}
	}
	/* Display elements of the stack after performing push and pop operations */
}
