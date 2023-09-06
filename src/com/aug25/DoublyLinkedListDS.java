package com.aug25;

public class DoublyLinkedListDS {
	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
		Node head,tail= null;
		public void addItem(int data) {
			Node newNode= new Node(data);
			
			if(head== null) {
				head= tail= newNode;
				head.previous=null;
				tail.next=null;
			}
		}
		public void display() {
			Node current= head;
			if(head==null) {
				System.out.println("list is empty");
				return;
			}
			System.out.println("nodes of doubly linked list");
			while(current!=null) {
				System.out.println(current.data+" ");
				current= current.next;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListDS obj= new DoublyLinkedListDS();
		obj.addItem(10);obj.addItem(15);obj.addItem(10);
		obj.display();

	}

}
