package pkoder.dsa.queue;

public class LinkQueue {
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enqueue(int data) {
		var node = new Node(data);
		node.next = null;
		if(isEmpty())
			head = tail = node;
		else {
			tail.next = node;
			tail = node;
		}
		size++;
	}
	
	public void dequeue() {
		if(isEmpty()) 
			throw new IllegalStateException();
		var temp = head;
		head = head.next;
		temp.next=null;
		size--;
	}
	
	public int whatsize() {
		return size;
	}
	
	public int peek() {
		if(isEmpty()) 
			throw new IllegalStateException();
		return head.value;
	}
	
	public void print() {
		var temp=head;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
}
