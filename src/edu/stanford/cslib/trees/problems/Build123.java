package edu.stanford.cslib.trees.problems;

public class Build123 {
	Node root;
	Build123(){
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
	public Node build123(){
		root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);
		return root;
	}

}
