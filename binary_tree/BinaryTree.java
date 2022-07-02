package pkoder.dsa.binary_tree;

import java.util.ArrayList;

public class BinaryTree {
	private class Node{
		private int value;
		private Node leftchild;
		private Node rightchild;
		
		public Node( int value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return "Node "+value;
		}
	}
	
	private Node root;
	
	public void insert(int data) { 
		var node = new Node(data);
		
		if (root == null) {
			root = node;
			return;
		}
		var current = root;
		while(true) {
			if (data < current.value) {
				if (current.leftchild == null) {
					current.leftchild = node;
					break;
				}
				current = current.leftchild;
			}
				
			else {
				if (current.rightchild == null) {
					current.rightchild = node;
					break;
				}
				current = current.rightchild;
			}
		}
	}
	
	public boolean find(int data) {
		var current = root;
		while(current!=null) {
			if(data < current.value)
				current = current.leftchild;
			else if (data > current.value)
				current = current.rightchild;
			else
				return true;
		}
		return false;
	}
	
	public void tranversePreOrder() {
		transversePreOrder(root);
	}

	private void transversePreOrder(Node root) {
		if(root == null)
			return;
					
		System.out.print(root.value+" ");
		transversePreOrder(root.leftchild);
		transversePreOrder(root.rightchild);
	}
	
	public void tranversePostOrder() {
		tranversePostOrder(root);
	}

	private void tranversePostOrder(Node root) {
		if(root == null)
			return;
					
		tranversePostOrder(root.leftchild);
		tranversePostOrder(root.rightchild);
		System.out.print(root.value+" ");
	}
	
	public void tranverseInOrder() {
		tranverseInOrder(root);
	}

	private void tranverseInOrder(Node root) {
		if(root == null)
			return;
					
		tranverseInOrder(root.leftchild);
		System.out.print(root.value+" ");
		tranverseInOrder(root.rightchild);
	}
	
	public int height() {
		return height(root);
	}
	
	private int height(Node root) {
		if(root==null)
			return -1;
		
		if (isLeafNode(root)) {
			return 0;
		}
		
		return 1+Math.max(height(root.leftchild), height(root.rightchild));
	}
	
	public int minimum() {
		return minimum(root);
	}
	
	
	//Binary tree
	private int minimum(Node root) {
		if (root == null)
			return 999; //refractor the code !
		
		if (isLeafNode(root))
			return root.value;
		
		var left = minimum(root.leftchild);
		var right = minimum(root.rightchild);
		
		return Math.min(Math.min(left, right), root.value);
	}
	
	private boolean isLeafNode(Node node) {
		return node.leftchild == null && node.rightchild == null;
	}
	
	//Binary Search tree
	
	//Equality
	public boolean equals(BinaryTree other) {
		if(other==null)
			return false;
		return equals(root, other.root);
	}
	
	
	
	private boolean equals(Node first,Node second) {
		if (first==null && second==null )
			return true;
		if (first!=null && second!=null )
			return first.value==second.value &&
					equals(first.leftchild, second.leftchild) &&
					equals(first.rightchild, second.rightchild);
		return false;
	}
	
	public boolean validate() {
		return validate(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean validate(Node root,int min,int max) {
		if (root==null)
			return true;
	    if (root.value>max || root.value<min) {
			return false;
			}
		return validate(root.leftchild,min,root.value-1)&& validate(root.rightchild,root.value+1,max);
	}
	
	public void PrintNodesatK(int k) {
		PrintNodesatK(root,k);
	}

	private void PrintNodesatK(Node root,int k) {
		if(root == null)
			return;
		if(k==0) {
			System.out.println(root.value);
			return;
		}
		PrintNodesatK(root.leftchild,k-1);
		PrintNodesatK(root.rightchild,k-1);
	}
	
	public ArrayList<Integer> GetNodesatK(int k) {
		var list = new ArrayList<Integer>();
		GetNodesatK(root,k,list);
		return list;
	}

	private void GetNodesatK(Node root,int k,ArrayList<Integer> list) {
		if(root == null)
			return;
		if(k==0) {
			list.add(root.value);
			return;
		}
		GetNodesatK(root.leftchild,k-1,list);
		GetNodesatK(root.rightchild,k-1,list);
	}
	
	public void traverseLevelOrder() {
		for(int i=0;i<=height();i++)
			PrintNodesatK(i);
	}
	
	public int size() {	
		return size(root);
		}
	
	private int size(Node root) {
		if (root==null)
			return 0;
		if (isLeafNode(root))
			return 1;
		return 1+size(root.leftchild)+size(root.rightchild);
	}
	
	public int leafCount() {
		return leafCount(root);
	}
	
	private int leafCount(Node root) {
		if(isLeafNode(root))
			return 1;
		return leafCount(root.rightchild)+leafCount(root.leftchild);
	}
	
	public int maxByRecursion() {
		if (root==null)
			throw new IllegalStateException();
			
		return maxByRecursion(root);
	}
	
	private int maxByRecursion(Node root) {
		if(root.rightchild==null)
			return root.value;
		return maxByRecursion(root.rightchild);
	}
	
	public boolean findByRecursion(int num) {
		return findByRecursion(root,num);
	}
	
	private boolean findByRecursion(Node root,int num) {
		if(root==null)
			return false;
		if(root.value==num)
			return true;
		return (findByRecursion(root.leftchild,num)||findByRecursion(root.rightchild,num));
	}
	
	public boolean siblings(int num1,int num2) {
		return siblings(root,num1,num2);
	}
	
	private boolean siblings(Node root,int num1,int num2) {
		if(root==null)
			return false;
		boolean siblings = false;
		if(root.rightchild!=null&&root.leftchild!=null)
			siblings = (root.leftchild.value==num1&&root.rightchild.value==num2)
					||(root.leftchild.value==num2&&root.rightchild.value==num1);
		return siblings ||siblings(root.leftchild,num1,num2)
				||siblings(root.rightchild,num1,num2);
	}
	
	public ArrayList<Integer> ancestors(int num) {
		var list = new ArrayList<Integer>();
	    ancestors(root,list,num);
	    return list;
	}
	
	private boolean ancestors(Node root,ArrayList<Integer> list,int num) {
		if(root==null)
			return false;
		if(root.value==num)
			return true;
		if(ancestors(root.leftchild,list,num)||ancestors(root.rightchild,list,num)) {
			list.add(root.value);
			return true;
		}
		return false;		
	}
	
	
	
}
