package edu.stanford.cslib.trees;

public class BinaryTree {
	Node root;
	//Constructor
	public BinaryTree(int data) {
		this.root = null;
	}
	
	public static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	

}
