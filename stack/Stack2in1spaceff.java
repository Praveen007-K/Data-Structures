package pkoder.dsa.stack;

import java.util.Arrays;

//SPACE EFFICIENT METHOD 
/**If we add two stack from both sides**/

public class Stack2in1spaceff {
	private int[] array;
	private int left;
	private int right;
	public Stack2in1spaceff(int size){
		this.array = new int[size];
		this.left = 0;
		this.right = size-1;
	}
	
	public void push1(int item) {
		if(isFull1()) 
			throw new StackOverflowError();
		array[left++] = item;
	}
	
	public void push2(int item) {
		if(isFull2()) 
			throw new StackOverflowError();
		array[right--] = item;
	}
	
	public int pop1() {
		if(isEmpty1())
			throw new IllegalStateException();
		return array[--left];
	}
	
	public int pop2() {
		if(isEmpty2())
			throw new IllegalStateException();
		return array[++right];
	}
	
	public boolean isEmpty1() {
		return left == 0;
	}
	
	public boolean isEmpty2() {
		return right == array.length-1;
	}
	
	public boolean isFull1() {
		return (right<left);
	}
	
	public boolean isFull2() {
		return (right<left);
	}
	
	public void print1() {
		int i = 0;
		while(i<left)
			System.out.println(array[i++]);
	}
	
	public void print2() {
		int i = array.length-1;
		while(i>right)
			System.out.println(array[i--]);
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}