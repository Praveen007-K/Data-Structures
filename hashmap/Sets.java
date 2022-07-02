package pkoder.dsa.hashmap;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static void main(String [] args) {
		Set<Integer> s = new HashSet<>();
		int [] numbers = {1,2,3,4,3,5,2,6,1};
		for(var num : numbers)
			s.add(num);
		System.out.println(s);
	}
}
