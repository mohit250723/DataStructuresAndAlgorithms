package com.mohit.stack;

public class Stack {

	int top=0;
	int capacity=1;
	
	int[] stack = new int[capacity];
	
	//push
	public void push(int data) {
		
		if(size()< capacity) {
			stack[top]=data;
			top++;
		}else {
			expandCapacity();
			stack[top]=data;
			top++;
			}
		}
	
	private void expandCapacity() {
		capacity = capacity+1;
		int[] expandStack= new int[capacity];
		
		for(int i=0;i<stack.length;i++) {
			
			expandStack[i]=stack[i];
		}
		
		   stack=expandStack;
		
	}

	//pop
	public int pop() {
		int popVal=-1;
		try {
		if(top<=capacity) {
		popVal= stack[top-1];	
		top --;	
		shrinkCapacity();
		
		}
		}catch (Exception e) {
			System.out.println(popVal==-1?"POP operation is failed, Stack is empty":popVal);
			resetStack();
		}
	
		
		return popVal;
	}
	
  private void resetStack() {
		top=0;
		capacity=1;
		int[] resetStack = new int[capacity];
		stack=resetStack;
		
	}

	private void shrinkCapacity() {
		int[] shrinkStack= new int[top];
		for(int i=0;i<top;i++) {
			shrinkStack[i]=stack[i];	
	   	}
		
		stack=shrinkStack;
	}

	//peek
	public int peek() {
		int peekVal=-1;
		try {
		if(top<=capacity) {
		peekVal= stack[top-1];	
		}
		}catch (Exception e) {
			System.out.println(peekVal==-1?"Peek Operation failed, Stack is empty":peekVal);	
			resetStack();
		}
	return peekVal;
	}
	
	//is empty
	public boolean isEmpty() {
		return top==0;
	}
	
	//size
	public int size() {
		return top;
	}
	//show
	public void show() {
		
		for(int s:stack) {
		System.out.print(s+" ");
		}
	}

}
