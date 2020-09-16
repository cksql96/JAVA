package practice;

import java.util.Scanner;

public class TTT {
	
	
	public static void main(String[] args) {
		
		int n;		
		
		Scanner sc = new Scanner(System.in);
				
		n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		//배열 안에 input값 넣기.
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}	//end 2nd for
		}	//end 1st for
		
		
		//넣은 배열 확인하기.
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j]);
			}	//end 2nd for
			System.out.println();
		}	//end 1st for						
		
		
		int a= 0;
		
		//대각선 모양으로, 정방향으로, 각각 더하기.
		for(int i = 0; i < n; i ++) {
			
			for(int j = 0; j < n; j ++) {
				
				if(i == j) {
					a+= arr[i][j];
				}	//end if
				
			}	//end 2nd for
			
		}	//end 1st for
		
//		[0][0] + [1][1] + [2][2];
//		[0][2] + [1][1] + [2][0];
		
		int count1 = 1;
		int count2 = 0;
		int b = 0;
		
		//대각선 모양으로, 역방향으로, 각각 더하기.
		//i 값은 1씩 늘고, j 값은 1씩 줄어든다.
		for(int i = 0; i < n; i ++) {
			
			for(int j = n-1; j >= 0; j --) {
				if(i == count2 && j == n-count1) {
					b+= arr[i][j];
					count1 ++;
					count2 ++;
				}	//end if
			}	//end 2nd for
			
		}	//end 1st for
		
		//a 와 b의 값을 보여준다.
		System.out.println(a);		
		System.out.println(b);
		
		//Math.abs를 이용하여, absolute값을 구한다.
		int result = Math.abs(a - b);
		System.out.println(result);

	}	//end main

}	//end class
