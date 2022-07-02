package pkoder.dsa.hashmap;

public class Main2 {
	public static void main (String [] args) {
		Hashtable h = new Hashtable();
		h.put(6, "A");
		h.put(8, "B");
		h.put(11, "C");
		//h.put(6, "A+");
		h.remove(6);
		System.out.println(h.get(8));
	}
}
