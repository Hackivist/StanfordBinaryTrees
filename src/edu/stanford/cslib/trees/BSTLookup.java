package edu.stanford.cslib.trees;

public class BSTLookup {
	
	public boolean lookup(Node node, int num){
		if(node==null){
			return false;
		}
		if(node.data==num){
			return true;
		}else if(node.data>num){
			return lookup(node.left, num);
		}else{
			return lookup(node.right, num);
		}
	}
}
