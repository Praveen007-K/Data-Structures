package pkoder.dsa.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node head;
	private Node tail;
	private Node temp;//var inside method is enough
	private int size;
	
	public void addFirst(int x) {
		var node = new Node(x);
		if(isEmpty())
			head = tail = node;
		else {
			node.next = head;
			head = node;
		}
		size++;
	}
	
	public void addLast(int x) {
		var node = new Node(x);
		if(isEmpty())
			head = tail = node;
		else
			tail.next = tail = node;
		size++;
	}
	
	public int indexOf(int x) {
		int count=0;
		temp = head;
		while(temp!=null) {
			if(temp.value==x)return count;
			count++;
			temp = temp.next;
		}
		return -1;
	}
	
	/**public boolean contains(int x) {
		temp = head;
		while(temp!=null) {
			if(temp.value==x)
				return true;
			temp = temp.next;
		}
		return false;
	}**/
	
	public boolean contains(int x) {
		return indexOf(x)!=-1;
	}
	
	public void removeFirst() {
		temp = head;
		if(isEmpty())
			throw new NoSuchElementException();
		
		if(head==tail) 
			head = tail = null;
		else {
			head = head.next;
			temp.next = null;
		}
		size--;
	}
	
	public void removeLast() {
		if(isEmpty())
			throw new NoSuchElementException();
		
		if(head==tail)
			head = tail = null;
		else {
			var previous = getprevious(tail);
			tail = previous;
			tail.next = null;
		}
		size--;
	}
	
	private Node getprevious(Node node) {
		temp = head;
		while(temp!=null) {
			if(temp.next==node)return temp;
			temp = temp.next;
		}
		return null;
	}
	
	public int size() {
		return size;
	}
	
	public int[] toArray() {
		int[] array = new int[size];
		temp = head;
		int i=0;
		while(temp!=null) {
			array[i++] = temp.value;
			temp = temp.next;
		}
		return array;
	}
	
	public void print() {
		temp=head;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	private boolean isEmpty() {
		return head == null;
	}

	public void reverse() {
		if(isEmpty()) return;
		
		var before = head;
		temp = head.next;
		while(temp!=null) {
			var after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
		
		temp = head;
		head = tail;
		tail = temp;
		tail.next = null;
	}
	
	//one pass method
	public int getKthFromTheEnd(int k) {
		if(isEmpty())
			throw new IllegalStateException();
		var current = temp = head;
		for(int i=0;i<k-1;i++) {
			temp = temp.next;
			if(temp == null)
				throw new IllegalArgumentException();
		}
		while(temp!=tail) {
			temp = temp.next;
			current = current.next;
		}
		
		return current.value;
	}

	public void printMiddle() {
		if (isEmpty())
			throw new IllegalStateException();
		
		var current = temp = head;
		while(temp!=tail) {
			temp = temp.next.next;
			if(temp==null) {
				System.out.println(current.value+" and "+current.next.value);
				return;
			}
			current = current.next;
		}
		System.out.println(current.value);
	}
	//IMPORTANT Same logic but more understanding
	/**public void printMiddleMosh() {
	if (isEmpty())
		throw new IllegalStateException();
	var a = head;
	var b = head;
	while (b != tail && b.next != tail) {
		b = b.next.next;
		a = a.next;
	}
	
	if (b == tail)
		System.out.println(a.value);
	else
		System.out.println(a.value + " , " + a.next.value);
	}**/
	
	
	public void hasLoop() {
		var slow = head;
		var fast = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow==fast) {
				System.out.println("Has loop");
				return;
			}
		}
		System.out.println("Has no loop");
	}
}


