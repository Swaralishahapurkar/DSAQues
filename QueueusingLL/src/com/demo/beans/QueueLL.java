package com.demo.beans;

public class QueueLL {
	private int front;
	private int rear;
	private int size;
	private LinkedList list;
	
	public QueueLL() {
		this.front=-1;
		this.rear=-1;
		this.size=0;
		this.list=new LinkedList();
	}
	public boolean isEmpty() {
		if(front==-1 && rear==-1)
			return true;
		else {
			return false;
		}
	}
	public boolean isFull() {
		this.size=LinkedList.getSize();
		if(front==0 && this.size==10)
			return true;
		else
			return false;
	}
	public void enqueue(String data) {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			list.addNode(data);
			front++;
			rear++;
			System.out.println("Queue is createdby adding first element");
		}else {
			if(isFull()) {
				System.out.println("the queue is full cannot add");
			}
			else {
				list.addNode(data);
				rear++;
				System.out.println(data + "is added");
			}
		}
	}
	public void dequeue(String data) {
		if(isEmpty()) {
			System.out.println("The queue is empty");
		}else {
			list.DeleteNode(data);
			rear--;
		}if(LinkedList.getSize()==0) {
			front=-1;
			rear=-1;
		}
	}
	public void sizeofQueue() {
		this.size=LinkedList.getSize();
		System.out.println("Size of queue is " + this.size);
		
	}
	public void displayQueue() {
		list.displayList();
	}
	
}
