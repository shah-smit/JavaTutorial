package com.yeartwo.lab.two;

public class TreeNode {
	TreeNode left;
	TreeNode right;
	int item;
	
	TreeNode(int i){
		item = i;
		left = null;
		right = null;
	}
	
	TreeNode(int i, TreeNode l, TreeNode r){
		this(i);
		left = l;
		right = r;
	}
	
	@Override
	public String toString(){
		String returnString = "[ ";
		if(left != null) returnString += "left: "+left.toString();
		else returnString += "left: null";
		
		returnString += " item: "+item;
		
		if(right != null) returnString += " right: "+right.toString();
		else returnString += " right: null";
		
		returnString += " ]";
		return returnString;
	}
}
