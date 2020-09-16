package ch01Toch04;

import java.util.Scanner;

public class ScannerExample3 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.reset();
		
		System.out.println("이름 나이 주소를 입력하세요: ");
		System.out.println(">>>");
		
		while(sc.hasNext()) {
			
			String token = sc.next();
			
			System.out.println(token);
			
		}	//end while		
		
		sc.close();
		
	}	//end main

}	//end class
