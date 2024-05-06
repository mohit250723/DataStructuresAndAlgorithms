package com.mohit.dsa.search;

public class BinarySearch {
	
	public static void main(String[] args) {
		//Given an array ... it must be sorted array...
		//Binary search , Algo. will find the mid and then check the target element if lesser or greater than mid 
		//and  then pick the respective portion of an array to go for further operation 
		
		//we will get the index through this operation..
		////Time complexity for Binary search is O(log n).. so better than linear search
		
		int[] arr= {1,12,23,54,95,806,99997};
		int target=12;
		int targetIndex= binarySearchAlgo(arr,target);
		if(targetIndex != -1) {
			System.out.print("Target : "+target+" is present at array index "+ targetIndex);;
			}else
			System.out.print("Target : "+target+ " is not found in given array");	
		}

	private static int binarySearchAlgo(int[] arr, int target) {
		
		int left=0;
		int right=arr.length-1;
		while(left < right) {
			int mid= (left+right)/2;
    			if(target == arr[mid]) {
				return mid;
			}else if(target > arr[mid]) {
				 left = mid+1;
			}else {
				right = mid-1;
			}
			
		}
			return -1;
	}

}
