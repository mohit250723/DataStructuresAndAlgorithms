package com.mohit.dsa.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		//given an array, Will compare the 2 values at a time starting from first 2 and then go ahead.. with each iteration biggest values will come at the end.
		//Not efficient way,
		int[] arr= {8,6,9,4,2,1};
		int arrTraverse= arr.length;
// Two loops will be required ..Outer is for traversing and inner will be for comparing and swaping
	for(int i=0;i< arrTraverse-1;i++) {
      for(int j=i+1;j<= arrTraverse-1; j++) {
			if(arr[i] > arr[j]) {
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
	    }
	}
	
	System.out.println("Sorted Array values by bubble sort");
	for(int arrVal:arr) {
		System.out.print(arrVal+" ");
	}
		
		
		
		
		
		
		
		
	}

}
