package ch01Toch04;

import java.util.Scanner;

public class ScannerExample {
	
	
	public static void main(String[] args) {
		
		//표준 입력 = 키보드 입력 = System.in
		Scanner sc = new Scanner(System.in);
		sc.reset();		//스캐닝할 준비를 마침.
		
		System.out.println("1. 이름을 입력하세요!");
		System.out.print(">");
		String name = sc.next();				//next는 한 단어. 띄어쓰기 x
		
		System.out.println("2. 나이를 입력하세요!");
		System.out.print(">");
		int age = sc.nextInt();					//next Int는 return type은 int
		sc.nextLine();
		
		System.out.println("3. 주소를 입력하세요!");
		System.out.print(">");
		String address = sc.nextLine();
		
		System.out.println("\n입력하신 값은!!");
		System.out.println("1. name \t= " + name);
		System.out.println("2. age \t\t= " + age);
		System.out.println("3. address \t= " + address);
		System.out.printf(
				"\n이름 : %s, 나이 : %d, 주소 : %s",
				name, age, address);
		
		//자원 반납: 스캐너 객체는 소위 "자원객체" 임. 
		//자원객체는 다 사용하고 나면, 반드시 닫아주어야
		//사용한 자원을 해제하게 됨.
		sc.close();
		
	}	//end main

}	//end class
