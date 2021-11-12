package com.planon.queue;

import com.planon.queue.queueimplementation.Queue;

public class Application{

	public static void main(String[] args) {
		Queue s = new Queue(10);
		s.insert("book1");
		s.insert("book2");
		s.insert("book3");
		s.insert("book4");
		s.display();
		s.delete();
		s.delete();
		s.display();
	}

}
