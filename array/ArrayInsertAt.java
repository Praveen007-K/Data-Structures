package pkoder.dsa.array;

class Arrayfour extends Array{
	Arrayfour(int length){
		super(length);
	}
	public void insertAt(int a,int b) {
		
		for(int i=items.length-2;i>=b;i--) {
			items[i+1]=items[i];
		}
		items[b]=a;
	}
	
	public void print() {
		for (int i = 0; i < items.length; i++) 
			System.out.println(items[i]);
	}
	
}

public class ArrayInsertAt {
	public static void main(String[] args) {
		Arrayfour four  = new Arrayfour(5);
		four.insert(11);
		four.insert(32);
		four.insert(54);
		four.insert(12);
		four.insertAt(999, 2);
		four.print();
	}
}
