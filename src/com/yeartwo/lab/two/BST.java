package com.yeartwo.lab.two;

public class BST {
	static TreeNode bst;
	public static void main(String[] args){
		System.out.println("WHAT!");
//		bst = new TreeNode(10);
//		System.out.println("WHAT!");
//		add(12);
//		add(1);
//		add(3);
//		System.out.println(bst);
//		remove(1);
//		System.out.println(bst);
	}
	
	public static void add(int i){
		TreeNode t = bst;
		while(t != null){
			break;
//			if(t.item > i){
//				if(t.left == null){
//					t.left = new TreeNode(i);
//					break;
//				}
//				else t = t.left;
//			}
//			if(t.item < i){
//				if(t.right == null){
//					t.right = new TreeNode(i);
//					break;
//				}
//				else t = t.right;
//			}
		}
	}
	
	public static void remove(int i){
		TreeNode t = bst;
		while(t != null){
			break;
//			if(t.left != null && t.item == i){
//				t.left = null;
//				break;
//			}
//			if(t.right != null && t.item == i){
//				t.right = null;
//				break;
//			}
//			if(t != null && t.item > i){
//				t = t.left;
//			}
//			if(t != null && t.item < i){
//				t = t.right;
//			}
		}
	}
}