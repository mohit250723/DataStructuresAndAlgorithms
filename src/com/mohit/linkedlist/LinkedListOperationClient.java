package com.mohit.linkedlist;

public class LinkedListOperationClient {
	
	 public static void main(String[] args) {
		
	Linkedlist linkedlist= new Linkedlist();
	linkedlist.insert(10);
	linkedlist.insert(5);
	linkedlist.insert(6);
	linkedlist.insertAtStart(99);
	linkedlist.insert(1, 11);
	linkedlist.insert(4,44);
	
	linkedlist.show();
	
	System.out.println("*********************************");
	
	linkedlist.remove(4);
	linkedlist.show();	 
	
	}

}
