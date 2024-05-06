package com.mohit.dsa.search;

public class LinearSearch {
	
	public static void main(String[] args) {
		//Given an array ... it can be sorted or unsorted 
		//Linear search , Algo. will iterate on array and search the target  one by one..
		
		//we will get the index through this operation..
		
		//Time complexity for linear search is O(n)
		
		int[] arr= {10,2,11,7,4,3,9};
		int target = 3;
		
		int targetIndex= linearSearchAlgo(arr,target);
		if(targetIndex != -1) {
		System.out.print("Target : "+target+" is present at array index "+ targetIndex);;
		}else
		System.out.print("Target : "+target+ " is not found in given array");	
	}

	private static int linearSearchAlgo(int[] arr, int target) {
		
		int arrLength=arr.length;
			for(int i=0; i< arrLength;i++) {
				if(arr[i] == target)
					return i;
				}

		return -1;
	}
	

}
