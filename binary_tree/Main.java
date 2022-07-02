package pkoder.dsa.binary_tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		 tree.insert(20);
		 tree.insert(10);
		 tree.insert(30);
		 tree.insert(6);
		 tree.insert(21);
		 tree.insert(4);
		 tree.insert(3);
		 tree.insert(8);
		 tree.insert(60);
		 
		 
		 BinaryTree tree2 = new BinaryTree();

		 tree2.insert(7);
		 tree2.insert(4);
		 tree2.insert(9);
		 tree2.insert(1);
		 tree2.insert(6);
		 tree2.insert(8);
		 tree2.insert(10);

		
			/*
			 * tree.tranversePreOrder(); tree.tranversePostOrder();
			 * tree.tranversePostOrder();
			 */
		
		 
		//System.out.print(tree.validate());
		 //tree2.PrintNodesatK(2);
		 //System.out.print(tree2.GetNodesatK(2));
		 //tree.traverseLevelOrder();
		System.out.print(tree.ancestors(60).toString());
	}
}
