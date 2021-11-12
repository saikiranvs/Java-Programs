package com.planon.queue.queueimplementation;

/* A queue is an ordered list which enables insert operations at one end
 * called REAR and delete operations to be performed at another end called FRONT.
 * Queue is referred to be as First In First Out list.
*/
public class Queue {
	public static String[] queue;
	public int front = -1, rear = -1;
	public int value;

	/*
	 * queue is an array of type string front and rear indicates as the indexes of
	 * the queue
	 */
	public Queue(int value) {
		this.value = value;
		queue = new String[value];
	}

	/* A constructor named queue accepts value to define the size of an array */
	public void insert(String string) {

		if (rear == (value - 1)) {
			return;
		}

		if ((front == -1) && (rear == -1)) {
			front = 0;
			rear = 0;
		} else {
			rear++;
		}

		queue[rear] = string;
	}

	/*
	 * Inserts an item from the rear end onto the queue.
	 *
	 * @param string the item to be inserted onto this queue.
	 */
	public void delete() {

		if ((front == -1) && (rear == -1)) {
			return;
		}

		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			String string = queue[front];
			front++;
		}
	}

	/*
	 * delete an item from the front end of the queue.
	 *
	 * @param string the item to be deleted from the queue.
	 */
	public void display() {

		for (int i = front; i <= rear; i++) {
			System.out.println(queue[i]);
		}
	}
	/*
	 * Display elements of the queue after performing insert and delete operations
	 */
}
