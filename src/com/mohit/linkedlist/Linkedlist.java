package com.mohit.linkedlist;

public class Linkedlist {
	
	// Implement insert or save method just like we have add method in actual implementation
	private Node head;
	private Node processingNode;
	
	//Insertion with data only
	public void insert(int data) {
		
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		
		if(head == null) {
			head=node;
		}else {
			//1,2,3
			processingNode=head;
			
			
			while(processingNode.next !=null) {
				processingNode=processingNode.next;
				
				}
			processingNode.next=node;
		}
	}
	
	
	//insertion as first element 
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		Node nxt= new Node();
		if(head == null) {
			head=node;
		}else {
			nxt=head;
			node.next=nxt;
			head=node;
		}
	}
	
	//insert data  at any index 

	public void insert(int index,int data) {

		Node node = new Node();
		node.data=data;
		node.next=null;
		if(index == 0 || head == null) {
		  insertAtStart(data);
		}else {
		
			processingNode = head;
			
			int startIndex=0;
				
				while(startIndex < index-1) {
					startIndex ++;
					processingNode=processingNode.next;
					}
				    
				  node.next=processingNode.next;
				  processingNode.next=node;
				
			}
		}
	
	
// remove from index
	public void remove(int index) {
		
		processingNode = head;
		
		int start=0;
		Node prevNode=new Node();
		//1,2,3,4
		
		if(index==0) {
		head=processingNode.next;
		}
		while(start < index) {
			 if(start== index-1) {
				prevNode = processingNode;
			}
			processingNode = processingNode.next;
			start++;
		}
		 
		  prevNode.next=processingNode.next;
		
		
	}
	
	public void show() {
		Node nodeIterable=head;
		while(nodeIterable.next != null) {
			System.out.println(nodeIterable.data);
			nodeIterable=nodeIterable.next;
		}
		System.out.println(nodeIterable.data);
  }
}
