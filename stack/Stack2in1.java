package pkoder.dsa.stack;

import java.util.Arrays;

//SPACE INEFFICIENT METHOD 
/** If we add two odd elements in 5 spaced stack
 *  it shows stackoverflow if we add 3rd element**/

public class Stack2in1 {
	private int[] array;
	private int odd;
	private int even;
	public Stack2in1(int size){
		this.array = new int[size];
		this.odd = 1;
		this.even = 0;
	}
	
	public void push1(int item) {
		if(isFull1()) 
			throw new StackOverflowError();
		array[odd] = item;
		odd = odd+2;
	}
	
	public void push2(int item) {
		if(isFull2()) 
			throw new StackOverflowError();
		array[even] = item;
		even = even+2;
	}
	
	public int pop1() {
		if(isEmpty1())
			throw new IllegalStateException();
		odd = odd-2;
		int a = array[odd];
		array[odd]=0;
		return a;
	}
	
	public int pop2() {
		if(isEmpty2())
			throw new IllegalStateException();
		even = even-2;
		int a = array[even];
		array[even]=0;
		return a;
	}
	
	public boolean isEmpty1() {
		return odd == 1;
	}
	
	public boolean isEmpty2() {
		return even == 0;
	}
	
	public boolean isFull1() {
		return odd>=array.length;
	}
	
	public boolean isFull2() {
		return even>=array.length;
	}
	
	public void print1() {
		int i = 1;
		while(i<array.length) {
			if(array[i]==0)
				return;
			System.out.println(array[i]);
			i = i+2;
		}
	}
	
	public void print2() {
		int i = 0;
		while(i<array.length) {
			if(array[i]==0)
				return;
			System.out.println(array[i]);
			i = i+2;
		}
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
