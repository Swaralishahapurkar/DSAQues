package com.demo.test;

import java.util.Scanner;

import com.demo.beans.BinarySearchTree;

public class TestBST {

	public static void main(String[] args) {
		
		
		BinarySearchTree bst=new BinarySearchTree();
		bst.insertkey(25);
		bst.insertkey(50);
		bst.insertkey(51);
		bst.insertkey(20);
		bst.insertkey(24);
		bst.inorder();
		System.out.println();
		//bst.postorder();
		//bst.preorder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Search :");
		int n = sc.nextInt();
		boolean isPresent = bst.search(n);
		if (isPresent) {
		    System.out.println(n + " is present in the binary search tree");
		}
		else {
		    System.out.println(n + " is not present in the binary search tree");
		}
		}
	
	}


