package pkoder.dsa.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindChar {
	public char findFirstNonRepeatingChar(String str) {
		Map<Character,Integer> map = new HashMap<>();
		var c = str.toCharArray();
		for(var ch : c ) {
			var count = map.containsKey(ch) ? map.get(ch):0;
			map.put(ch, count+1);
		}
		for(var ch : c) 
			if(map.get(ch)==1)
				return ch;
		
		return Character.MIN_VALUE;
	}
	//MINE
	public char findFirstRepeatingChar(String str) {
		Map<Character,Integer> map = new HashMap<>();
		var c = str.toCharArray();
		for(var ch: c) {
			int count = map.containsKey(ch)?map.get(ch):0;
			map.put(ch, count+1);
		}
		for(var ch: c) 
			if(map.get(ch)>1)
				return ch;
		return Character.MIN_VALUE;
	}
	//MOSH
	public char findFirstRepeatingChar2(String str) {
		Set<Character> set = new HashSet<>();
		var c = str.toCharArray();
		for(var ch: c) {
			if(set.contains(ch))
					return ch;
			set.add(ch);
		}
		return Character.MIN_VALUE;
	}
}
