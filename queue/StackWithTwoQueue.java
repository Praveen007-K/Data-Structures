package pkoder.dsa.queue;
import java.util.Queue;
import java.util.ArrayDeque;

public class StackWithTwoQueue {
	private Queue<Integer> q1 = new ArrayDeque<>();
	private Queue<Integer> q2 = new ArrayDeque<>();
	private int top;
	
	public void push(int item) {
		q1.add(item);
		top=item;
	}
	
	public int pop() {
		if(isEmpty())
			throw new IllegalStateException();
		while(q1.size()>1) {
			top=q1.remove();
			q2.add(top);
		}
		swap();
		return q2.remove();
	}
	
	private void swap() {
		var temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
	
	public int size() {
		return q1.size();
	}
	
	public int peek() {
		if(isEmpty())
			throw new IllegalStateException();
		return top;
	}
	
	@Override
	public String toString() {
		return q1.toString();
	}
}
