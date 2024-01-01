package com.demo.beans;

public class BinarySearchTree {
	class Node{
		int data;
		Node left,right;
		public Node(int d) {
			data=d;
			left=null;
			right=null;
		}	
	}
	private Node root;
	public BinarySearchTree() {
		root=null;
	}
	//insert key 
	public void insertkey(int key) {
		root=insertrecord(root,key);
	}
	private Node insertrecord(Node root, int key) {
		if(root==null) {
			root= new Node(key);
			return root;
		}
		if(key<root.data) {
			root.left=insertrecord(root.left,key);
		}
		else {
			root.right=insertrecord(root.right,key);
		}
		return root;
	}
	public void inorder() {
		inorderTraversal(root);
	}
	private void inorderTraversal(Node root) {
		if(root!=null) {
		inorderTraversal(root.left);
		System.out.println(root.data+",");
		inorderTraversal(root.right);
		}
		
	}
	
	public void preorder() {
		preorderTraversal(root);
	}
	private void preorderTraversal(Node root) {
		if(root!=null) {
		System.out.println(root.data+",");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		}
	}
	
	public void postorder() {
		postorderTraversal(root);
	}
	private void postorderTraversal(Node root) {
		if(root!=null) {
		postorderTraversal(root.left);
		System.out.println(root.data + ",");
		postorderTraversal(root.right);
		}
		
	}
	public boolean search(int number) {
	if(root == null)
		return false;
	while(root != null) {
		if(root.data == number) {
			return true;
		}
		if(root.data <= number) {
			root = root.right;
		}else {
			root = root.left;
		}
	}
	return false;
	}
}
	


