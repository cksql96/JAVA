package practice;

import java.util.Scanner;

public class TTT2 {
	
	
	public static void main(String[] args) {
		
		int n;		
		Scanner sc = new Scanner(System.in);
				
		n = sc.nextInt();		//1차원 배열이고, 문제가 정사각형에서 구하는 거기 때문에.
		int y = n * n;			// y = n * n을 해주었다. 2차원은 노필요.									
		int arr[] = new int[y];	//arr의 길이를 y로 해주었다.
		
		//input 값을 arr이라는 배열에 넣는다.
		for(int i = 0; i < y; i++) {
			arr[i] = sc.nextInt();
		}
		
		int a= 0, b = 0;
		
		//입력받은 input값을 보여준다.
		System.out.println("입력하신 값들이 배열안에 잘 들어갔습니다!");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + "  ");
			
			if( (i+1) % n == 0) {
				System.out.println();		//이쁘게 만들어준다.
			}
			
		}
		
		System.out.println("-------------");
		
		
		//	[0] [1] [2]     [0]  [1]  [2]  [3]
		//	[3] [4] [5]		[4]  [5]  [6]  [7]
		//	[6] [7] [8]		[8]  [9]  [10] [11]
		//					[12] [13] [14] [15]
		
		//정방향 대각선 더한 값 구하기.
		for(int i = 0; i < y; i= i + n + 1) {
			a += arr[i];
		}
		
		//역방향 대각선 더한 값 구하기.
		for(int i = y-1 - (n-1); i > 0; i= i-(n-1)) {
			b += arr[i];
		}
						
		//a 와 b의 값을 보여준다.
		System.out.println("\na값은 : " + a);		
		System.out.println("b값은 : " + b);
		
		//Math.abs를 이용하여, absolute값을 구한다.
		int result = Math.abs(a - b);
		System.out.println("\n\n|a - b| = " + result);


	}	//end main
	

}	//end class
