package pkoder.dsa.stack;

import java.util.Arrays;

public class Minstack {
	private int[] array;
	private int[] minarray;
	private int index;
	private int min;
	public Minstack(int size){
		this.array = new int[size];
		this.minarray = new int[size];
		this.index = size-1;
	}
	private int i;
	public void push(int item) {
		if(index==-1) 
			throw new StackOverflowError();
		array[index--] = item;
		if(item<min || i==0)
			minarray[i++]=min=item;
	}
	
	public int pop() {
		if(isEmpty())
			throw new IllegalStateException();
		++index;
		if(minarray[i-1]==array[index])
			i--;
		return array[index];
	}
	
	public boolean isEmpty() {
		return index == array.length-1;
	}
	
	public int minimum() {
		return minarray[i-1];
	}
	
	@Override
	public String toString() {
		var contents = Arrays.copyOfRange(array, index+1, array.length); 
		return Arrays.toString(contents);
	}
}
