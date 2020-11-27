package com.zerock.TTT;

class PracticeHackerRank {

	public static void main(String[] args) {
		
		int[] arr;
		
		arr = new int[] {256741038,623958417,467905213,714532089,938071625};
		
		System.out.println(arr.length);
		
		int count = 0;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		
		for(int j = 0; j < arr.length; j++) {
			long sum = 0;			
			
			for(int i = 0; i < arr.length; i++) {
				
				if(i == count) {
					continue;
				} else {
					sum += arr[i];
				}	//if-else
								
			}	//inner for
			
			count ++;
			System.out.println(j + "번째 결과: " + sum);
			
			if(min >= sum) {
				min = sum;
			}	//if
			
			if(max <= sum) {
				max = sum;
			}	//if
			
		}	//for
		
		System.out.println("min:" + min);
		System.out.println("max:" + max);		

	}	//end main

}	//end class
