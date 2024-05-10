package com.mohit.stack;

public class StackCallClient {
public static void main(String[] args) {
	
	Stack s= new Stack();
	
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(0);
	
	s.show();
	System.out.println();
	System.out.println("Size is :"+  s.size());
	
	System.out.println("**********Aplying POP****************");
	System.out.println("Pop Value:"+ s.pop());
	s.show();
	System.out.println();
	System.out.println("Pop Value:"+ s.pop());
	s.show();
	System.out.println();
	System.out.println("Size is :"+  s.size());
	System.out.println("Peek Value:"+ s.peek());
	System.out.println();
	s.show();
	System.out.println();
	System.out.println("Size is :"+  s.size());
	System.out.println("Pop Value:"+s.pop());
	System.out.println("Pop Value:"+s.pop());
	System.out.println("is empty+:"+s.isEmpty());
	s.show();
	System.out.println();
	System.out.println("Pop Value:"+s.pop());
	System.out.println("is empty:"+s.isEmpty());
	System.out.println("Size is :"+  s.size());
	s.show();
	s.pop();
	s.peek();
	
	s.push(21);
	s.push(27);
	s.push(22);
	
	s.show();
	System.out.println();
	System.out.println("Size is :"+  s.size());
}
}
