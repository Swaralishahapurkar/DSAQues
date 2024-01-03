package com.demo.beans;

public class LinkedList {
	private Node head;
	static int size=0;
	
	class Node{
		private String data;
		private Node next;
		
		public Node(String data) {
			this.data=data;
			this.next=null;
		}
	}
	public LinkedList() {
		head=null;
	}
	
	public void addNode(String data) {
		Node newNode= new Node(data);
		{
			if(head==null) {
				System.out.println("List is empty");
				head=newNode;
				size++;
				System.out.println("New List has been made by adding first node");
			}else if(size==1) {
				head.next=newNode;
				size++;
				System.out.println("New added successfully");
			}else {
				Node temp=head;
				while(temp!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
				size++;
				System.out.println("New added successfully");		
			}	
		}	
	}
	public void DeleteNode(String data) {
		if(head==null) {
			System.out.println("List is already empty");
		}else if(size==1) {
			System.out.println(head.data + "deleted successfully");
			head=null;
			size--;
		}else {
			System.out.println(head.data + "deleted successfully");
			Node temp=head;
			head=temp.next;
			temp=null;
			size--;
		}
	}
	public static int getSize() {
		return size;
	}
	public void displayList() {
		Node temp=head;
		System.out.println();
		while(temp!=null) {
			System.out.println(temp.data + "");
		}
		System.out.println();
	}
}
