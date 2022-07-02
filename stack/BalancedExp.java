package pkoder.dsa.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExp {
	String x;
	private final List<Character> leftBrackets = Arrays.asList('(','[','<','{');
	private final List<Character> rightBrackets = Arrays.asList(')',']','>','}');
	public BalancedExp(String x){
		this.x = x;
	}//common for both 
	
	public boolean isBalanced() {
		Stack<Character> s = new Stack<>();
		
		if(x==null)
			throw new IllegalArgumentException();
		String open = "({[<";		
		String close = ")}]>";	
		char y;
		for(char ch :x.toCharArray()) {
			if(open.contains(ch+""))
				s.push(ch);
			else if (close.contains(ch+"")) {
				if(s.empty())return false;
				y = s.pop();
				if(ch!=close.charAt(open.indexOf(y)))
					return false;
			}
		}
		return s.empty();
	}
	
	public boolean isBalanced2() {
		Stack<Character> stack = new Stack<>(); 
		
		for(char ch :x.toCharArray()) {
			if(isLeftBracket(ch))
				stack.push(ch);
			if(isRightBracket(ch)) {
				if(stack.empty())return false;
				
				var top = stack.pop();
				if(isMatching(top, ch))return false;
			}
		}
		return stack.empty();
	}
	//rename all references once shortcut?-refractor-also field change-method to outside
	private boolean isLeftBracket(char ch) {
		return leftBrackets.contains(ch);
	}
	private boolean isRightBracket(char ch) {
		return rightBrackets.contains(ch);
	}
	private boolean isMatching(char left, char right) {
		return leftBrackets.indexOf(left)!=rightBrackets.indexOf(right);
	}
	
}
