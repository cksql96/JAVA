package HackerRank.InterviewPreparation.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class minimumSwaps2_2_2 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("넣은 수: " + Arrays.toString(arr));
		
//		Arrays.sort(arr);
//		
//		System.out.println(Arrays.toString(arr));
		
		//Start
		int swap=0;
		
        for(int i = 0; i < arr.length; i++){
        	System.out.println(i+1 + "번째 for 실행");
        	
        	int temp;
        	
            if(i+1 != arr[i]){
            	System.out.println("\t++ if문 실행");
                int j=i;
                
                while(arr[j] != i+1){
                	System.out.println("\t++ while문 실행");
                    j++;
                }	//while
                
                temp=arr[j];                
                arr[j]=arr[i];
                arr[i]=temp;
                swap++;
                
                System.out.println("\t++ sort실행: " + Arrays.toString(arr));                
                System.out.println("\t++ swap횟수: " + swap);
            }	//if
        }	//for
        
        System.out.println(swap);
		
	}	//end main

}	//end class
