package ch01Toch04;

import java.util.Scanner;

public class DoWhileExample {
	
	
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 눌러라");
		
		Scanner sc = new Scanner(System.in);
		String input = "999";
		int number = -1;
		
		do {
			System.out.print(">");
			
			//input = sc.nextLine();			
			number = sc.nextInt();
			
			System.out.println(number);
		}while(!input.equals(String.valueOf(number) ) );

		
		System.out.println();
		System.out.println("프로그램 종료");
		
		sc.close();
		
		
	}	//	end main

}	//end class
