package com.mohit.dsa.sorting;

public class InsertionSort {
	public static void main(String[] args) {
	//given an array,
	int[] arr= {8,6,1,4,2,9};
	int arrTraverse= arr.length;
	for(int i=1;i< arrTraverse;i++) {
    int key=arr[i];
	int j=i-1;
	while(j >= 0 && key< arr[j]) {
		  arr[j+1]=arr[j];
		   j=j-1;
		 }	
	
	  arr[j+1]=key;
   }
	
 System.out.println("Sorted Array values by Insertion sort");
 for(int arrVal:arr) {
	System.out.print(arrVal+" ");
 }
	
  }
   }
