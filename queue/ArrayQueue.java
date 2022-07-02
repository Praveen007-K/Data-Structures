package pkoder.dsa.queue;

import java.util.Arrays;

public class ArrayQueue {
	int [] array;
	public ArrayQueue(int size) {
		array = new int[size];
	}
	private int left;
	private int right;
	
	public void enqueue(int item) {
		if(isFull())
			throw new IllegalStateException();
		array[right] = item;
		right = (right+1)%array.length;
	}
	
	public int dequeue() {
		if(isEmpty())
			System.out.println("EMPTY");
		var x =array[left];
		array[left] = 0;
		left = (left+1)%array.length;
		return x;
	}
	
	public void print() {
		for(int i=left;i<right;i++)
			System.out.println(array[i]);
	}
	
	public int peek() {
		if(left==right)
			System.out.println("EMPTY");
		return array[left];
	}
	
	public boolean isEmpty() {
		return left==right;
	}
	
	public boolean isFull() {
		return right==array.length;
	}
	
	//Queue exercise 1
	public void reversek(int k) {
		if(k>array.length)
			throw new IllegalStateException();
		else {
			int n=0,temp;
			while(k-1!=n) {
				temp = array[k-1];
				array[k-1] = array[n];
				array[n] = temp;
				k--;
				n++;
			}
		}
	}
	
	public void swap(int a,int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
//circular queue done. so isfull - r++ != 0; isempty cndtn also changes
// Mosh solve this method using count as a variable for full and empty
/** COUNT==0 EMPTY & COUNT==LENGTH FULL
 * IF NOT CIRCULAR RIGHT AND LEFT IS ENOUGH(MY IDEA)**/

