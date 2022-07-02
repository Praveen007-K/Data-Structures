package pkoder.dsa.avltree;

public class Main {
	public static void main (String args[]) {
		var avl = new AVLTree();
		
		avl.insert(10);
		avl.insert(20);
		avl.insert(30);
		
		//debug the problem
		
		
		System.out.print(avl.isPerfect());
	}
}
