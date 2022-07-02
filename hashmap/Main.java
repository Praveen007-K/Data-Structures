package pkoder.dsa.hashmap;

public class Main {
	public static void main (String [] args) {
		//Mosh
		FindChar f= new FindChar();
		var ans = f.findFirstNonRepeatingChar("a gggrreen rnnpppllle");
		System.out.println(ans);
		var ans2 = f.findFirstRepeatingChar2("green apple");
		System.out.println(ans2);
		
		//In cryptography hashmaps are used to store peoples password "73534fjjfjj555334hh" and these are stored in index values.
		//Every string has a hashcode. [str.hashcode]
		
		/**Map<Integer,Character> map = new HashMap<>();
		String input = "a greg roat";
		for(int i=input.length()-1;i>=0;i--) {
			int count=0;
			char c = input.charAt(i);
			for(int j=0;j<input.length();j++) {
				if(c==input.charAt(j)) {
					count++;
				}
			}
			map.put(count, c);
		}
		System.out.println(map.get(1));**/
	}
}
