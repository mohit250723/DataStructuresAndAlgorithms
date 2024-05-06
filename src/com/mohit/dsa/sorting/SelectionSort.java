package com.mohit.dsa.sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		//given an array,
		int[] arr= {8,6,1,4,2,9};
		int arrTraverse= arr.length;
		int selectMaxValIndex=0;
		int temp=0;
		
	for(int i=0;i< arrTraverse-1;i++) {
		selectMaxValIndex=0;
		System.out.println("Setting up selectMaxValIndex = -1 Outer Loop");
		
		// For Inner loop,iteration reduced with each other iteration
      for(int j=1;j< arrTraverse-i; j++) {
    	  
    	  System.out.println("###########################");
    	  System.out.println("selectedMaxVal: "+ arr[selectMaxValIndex]);
    	  System.out.println("arr[j] : "+ arr[j]);
    	 
			if (arr[j] > arr[selectMaxValIndex]) {
				System.out.println("arr[j] > selectedMaxVal YES" );
				// Here we are setting up the new max value if found...
				selectMaxValIndex=j;
			}
	    }
      // Here we are swaping in outer loop so this swaping is only once in single iteration
     		
    if(arr[selectMaxValIndex] != arr[arrTraverse-1-i] ) {
        	
        	System.out.print("Inside  SWAPING AREA.....................");
           	temp=arr[arrTraverse-1-i];
			arr[arrTraverse-1-i] = arr[selectMaxValIndex];
			arr[selectMaxValIndex]=temp; 
			
   }
   System.out.println("After swaping");
   for(int arrVal:arr) {
  		System.out.print(arrVal+" ");
  	  }
   }
	
	System.out.println("Sorted Array values by Selection sort");
	for(int arrVal:arr) {
		System.out.print(arrVal+" ");
	}
		
	}

}
