package pkoder.dsa.avltree;

public class AVLTree {
	private class AVLNode{
		private int value;
		private int height;
		//private int bf;
		private AVLNode leftchild;
		private AVLNode rightchild;
		
		public AVLNode(int value) {
			this.value=value;
		}
		
		@Override
		public String toString() {
			return "Value= "+this.value;
		}
	}
	
	private AVLNode root;
	
	public void insert(int data) {
		root = insert(root,data);
	}
	
	private AVLNode insert(AVLNode root,int data) {
		if (root==null)
			return new AVLNode(data);
		if(data<root.value)
			root.leftchild = insert(root.leftchild,data);
		else
			root.rightchild = insert(root.rightchild,data);
		setHeight(root);
		return balance(root);

	}
	
	private AVLNode balance (AVLNode root) {
		//newroot = root;
	if(isLeftHeavy(root))
		{
		if (balanceFactor(root.leftchild)< 0)
			root.leftchild = leftRotate(root.leftchild);
		return rightRotate(root);
		}
	else if(isRightHeavy(root)) {	
		if (balanceFactor(root.rightchild)> 0)
			root.rightchild = rightRotate(root.rightchild);
		return leftRotate(root);
	}
		return root;
	}
	
	private int height(AVLNode node) {
		return (node == null)?-1:node.height;
	}
	
	private boolean isLeftHeavy(AVLNode node) {
		return balanceFactor(node)>1;
	}
	
	private boolean isRightHeavy(AVLNode node) {
		return balanceFactor(node)<-1;
	}
	
	private int balanceFactor(AVLNode node) {
		return (node == null)?0:height(node.leftchild)-height(node.rightchild);
	}
	
	private AVLNode rightRotate(AVLNode node) {
		var newroot = node.leftchild;
		node.leftchild = newroot.rightchild;
		newroot.rightchild = node;
		setHeight(node);
		setHeight(newroot);
		return newroot;
	}
	
	private AVLNode leftRotate(AVLNode node) {
		var newroot = node.rightchild;
		node.rightchild = newroot.leftchild;
		newroot.leftchild = node;
		setHeight(node);
		setHeight(newroot);
		return newroot;
	}
	
	private void setHeight(AVLNode node) {
		node.height = Math.max(height(node.leftchild), height(node.rightchild))+1;
	}
	
	public boolean isBalanced() {
		return isBalanced(root);
	}
	
	private boolean isBalanced(AVLNode root) {
		if(root==null)
			return true;
		if(isRightHeavy(root) || isLeftHeavy(root)) 
			return false;
		return (isBalanced(root.leftchild)||isBalanced(root.rightchild));
	}
	
	public boolean isPerfect() {
		return isPerfect(root);
	}
	
	private boolean isPerfect(AVLNode root) {
		if(root==null)
			return true;
		if((2^(root.height+1)-1)== size(root)) 
			return true;
		return false;
	}
	
	public int size() {	
		return size(root);
		}
	
	private int size(AVLNode root) {
		if (root==null)
			return 0;
		if (isLeafNode(root))
			return 1;
		return 1+size(root.leftchild)+size(root.rightchild);
	}
	
	private boolean isLeafNode(AVLNode node) {
		return node.leftchild == null && node.rightchild == null;
	}
	
}
