package pkoder.dsa.queue;

public class Main2 {
	public static void main(String[] args){
		StackWithTwoQueue stq = new StackWithTwoQueue();
		
		stq.push(2);
		stq.push(1);
		stq.push(5);
		stq.push(4);
		stq.push(6);
		stq.push(9);
		
		System.out.println(stq.toString());
		
		
		System.out.println(stq.peek());
		
		stq.pop();
		
		System.out.println(stq.toString());
		
		System.out.println(stq.size());
	}
}