package HackerRank.InterviewPreparation.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			int b = sc.nextInt();
			a[i] = b;
		}	//for

		System.out.println("sort 전 배열: " + Arrays.toString(a) + "\n");
		
		countSwaps(a);
		
		System.out.println("\nsort 후 배열: " + Arrays.toString(a));
		
		sc.close();
		
	}	//end main

	static void countSwaps(int[] a) {
		
		System.out.println("countSwaps(a) invoked...");
				
		int numSwaps = 0;
		int temp;
		
		for(int i = 0; i < a.length; i ++) {
			
			for(int j = 0; j < a.length-1-i; j++) {
				
				if(a[j] > a[j +1]) {
					
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					numSwaps++;
					
					System.out.println("\t++swaps!! " + Arrays.toString(a));					
				}	//if
				
			}	//inner for
			System.out.println("   innerloop end");
			
		}	//for
		System.out.println();
		
		
		System.out.println("Array is sorted in " + numSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length-1]);
		
	}	//countSwaps

}	//end class
