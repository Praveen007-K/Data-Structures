package pkoder.dsa.queue;

import java.util.*;

public class StackQueue {
	Stack<Integer> s1;
	Stack<Integer> s2;
	public StackQueue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	public void enqueue(int item) {
		s1.push(item);
	}
	
	public int dequeue() {
		if(isEmpty())
			throw new IllegalStateException();
		
		moveS1toS2();
		
		return s2.pop();
	}

	private void moveS1toS2() {//Refractored method
		if(s2.isEmpty())
			while(!s1.isEmpty())
					s2.push(s1.pop());
	}
	
	public int peek() {
		if(isEmpty())
			throw new IllegalStateException();
		
		moveS1toS2();
		
		return s2.peek();
	}
	
	public boolean isEmpty() {
		return s1.isEmpty()&&s2.isEmpty();
	}
	
	
}
//In peek and pop we move s1 to s2 - Refractor time- change it to a mathod.
