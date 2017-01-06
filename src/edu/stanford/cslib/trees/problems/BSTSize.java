package edu.stanford.cslib.trees.problems;

import edu.stanford.cslib.trees.Node;

public class BSTSize {
	
	public int TreeSize(Node node){
		if(node==null){
			return 0;
		}else{
			return (TreeSize(node.left)+1+TreeSize(node.right));
		}
	}
}
