package pkoder.dsa.stack;

import java.util.Arrays;

public class Stack {
	
	private int[] array;
	private int index;
	public Stack(int size){
		this.array = new int[size];
		this.index = size-1;
	}
	
	public void push(int item) {
		if(index==-1) 
			throw new StackOverflowError();
		array[index--] = item;
	}
	
	public int pop() {
		if(isEmpty())
			throw new IllegalStateException();
		return array[++index];
	}
	
	public int peek() {
		if(isEmpty())
			throw new IllegalStateException();
		return array[index+1];
	}
	
	public boolean isEmpty() {
		return index == array.length-1;
	}
	
	public void print() {
		int i = index+1;
		while(i!=array.length)
			System.out.println(array[i++]);
	}
	
	@Override
	public String toString() {
		var contents = Arrays.copyOfRange(array, index+1, array.length); 
		return Arrays.toString(contents);
	}
}
