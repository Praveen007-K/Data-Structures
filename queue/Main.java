package pkoder.dsa.queue;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> que = new ArrayDeque<>();
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		System.out.println(que);
		reverse(que);
		System.out.println(que);
	}
	
	public static void reverse(Queue<Integer> q) {
		Stack<Integer> stack = new Stack<>();
		while(!q.isEmpty())
			stack.push(q.remove());
		while(!stack.isEmpty())
			q.add(stack.pop());
	}
}
