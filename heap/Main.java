package pkoder.dsa.heap;

public class Main {
	public static void main(String [] args) {
		Heap heap = new Heap();
		
//		heap.insert(15);
//		heap.insert(10);
//		heap.insert(3);
//		heap.insert(8);
//		heap.insert(12);
//		heap.insert(9);
//		heap.insert(4);
//		heap.insert(1);
//		heap.insert(24);
		
		heap.insert(10);
		heap.insert(5);
		heap.insert(17);
		heap.insert(4);
		heap.insert(22);
		System.out.print(heap.remove());
	}
}
