package HackerRank.InterviewPreparation.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class minimumSwaps2_1_1 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr);
//		
//		System.out.println(Arrays.toString(arr));
		
		//Start		
		int min;
		int temp;
		int count = 0;
				
		for(int i = 0; i < arr.length-1; i++) {
			min = i;
			boolean go = false;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					System.out.println("if문 실행!!");
					min = j;
					go = true;
				}
			}	//inner for
			if(go) {
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
				count ++;
				System.out.println("sort 하였습니다.");
			}			
		}	//for
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		
	}	//end main

}	//end class
