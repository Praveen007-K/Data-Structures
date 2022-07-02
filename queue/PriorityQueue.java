package pkoder.dsa.queue;

import java.util.Arrays;

public class PriorityQueue {
	private int [] array;
	private int count;
	public PriorityQueue(int size){
		array = new int[size];
	}
	
	public void add(int item) {
		if(isFull())
			throw new IllegalStateException();
		var i = shiftingToInsert(item);
		array[i]=item;
		count++;
	}
	
	public int remove() {
		if(isEmpty())
			throw new IllegalStateException();
		return array[--count];
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public boolean isFull() {
		return count==array.length;
	}
	
	@Override
	public String toString(){
		return Arrays.toString(array);
	}
	
	//comment only where code is not self explanatory-make it pvt method
	//method name should explain for what purpose? without comments
	private int shiftingToInsert(int item) {
		int i;
		for(i=count-1;i>=0;i--) {
			if(array[i]>item)
				array[i+1] = array[i];
			else
				break;
		}
		return i+1;
	}
}