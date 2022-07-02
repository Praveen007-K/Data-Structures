package pkoder.dsa.array;

class Arraytwo extends Array{
	Arraytwo(int length){
		super(length);
	}
	/**public void intersect(Arraytwo a) {
		for(int i=0;i<items.length;i++)
			for(int j=0;i<a.length;j++) {
				if(items[i]==a[j]) {
					System.out.print(items[i]);
					break;
				}
			}
	}**/
	
	public int[] array() {
		return items;
	}
}

public class ArrayIntersection {
	public static void main(String[] args) {
		Arraytwo two = new Arraytwo(5);
		Arraytwo c = new Arraytwo(5);
		two.insert(2);
		two.insert(3);
		two.insert(4);
		two.insert(5);
		c.insert(4);
		c.insert(5);
		c.insert(6);
		c.insert(7);
		//two.intersect(c);
	}
}
