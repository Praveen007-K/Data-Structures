package pkoder.dsa.array;

class Arraythree extends Array{
	private int [] b;
	Arraythree(int length){
		super(length);
		b = new int[length];
	}
	
	public void reverse(){
		for(int i=0;i<items.length;i++) {
			b[i]=items[items.length-1-i];
		}
		for(int i=0;i<items.length;i++) {
		items[i]=b[i];
		}
	}
	
}

public class ArrayReverse {
	public static void main(String[] args) {
		Arraythree three = new Arraythree(5);
		three.insert(1);
		three.insert(3);
		three.insert(8);
		three.insert(2);
		three.insert(7);
		three.print();
		three.reverse();
		three.print();
	}
}
