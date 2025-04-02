package com.striver.StriverSheetProblems;

public class LargestElementArray {
	
	public static int GLOBAL_MAX_INTEGER = Integer.MIN_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * BruteForce: 
		 * Introduce a max element
		 * Compare each element with previous element and till last element reached.
		 * Complexity -> O(n) Space -> O(1)
		 * */
		
		/*
		 * Sort and choose first element
		 * Complexity -> O(nlogn) O(n)
		 */
		int[] arr = {2,5,1,3,0};
		int num = maxElementFind(arr);
		System.out.println(num);

	}
	
	public static int maxElementFind(int[] arr) {
		int MAX_INTEGER = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > MAX_INTEGER)
				MAX_INTEGER = arr[i];
		}
		return MAX_INTEGER;
	}

}
