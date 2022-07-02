package pkoder.dsa.stack;

public class Main {
	public static void main(String[] args) {
		
		Stack2in1spaceff stack = new Stack2in1spaceff(5);
		
		
		stack.push1(111);
		stack.push1(222);
		stack.push1(333);



		stack.push2(7);
		stack.push2(4);

		
		//System.out.println("Stack 1");
		//stack.print1();
		//System.out.println("Stack 2");
		//stack.print2();
		
	
		System.out.println(stack.isEmpty1());
		

		//System.out.println(x);
		//System.out.println(y);

		//System.out.println(stack);
	}
}
