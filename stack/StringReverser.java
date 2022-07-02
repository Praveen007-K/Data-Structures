package pkoder.dsa.stack;

import java.util.Stack;

public class StringReverser {
	Stack<Character> s = new Stack<>();
	StringBuffer reversed = new StringBuffer();
	
	public String reverse(String x) {
		if(x==null)
			throw new IllegalArgumentException();
		for(char ch :x.toCharArray())
			s.push(ch);

		while(!s.empty())
			reversed.append(s.pop());
		
		return reversed.toString();
	}
}
