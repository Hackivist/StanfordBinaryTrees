package edu.stanford.cslib.trees;

public class BSTInsert {
	/*  
   Recursive insert -- given a node pointer, recur down and 
   insert the given data into the tree. Returns the new 
   node pointer (the standard way to communicate 
   a changed pointer back to the caller). 
  */ 
	public Node insert(Node node, int data){
		if(node==null){
			node = new Node(data);
		}else{
			if(node.data>data){
				return insert(node.left,data);
			}else{
				return insert(node.right,data);
			}
		}
		return node;
	}
}
