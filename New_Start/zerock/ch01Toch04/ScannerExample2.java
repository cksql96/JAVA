package ch01Toch04;

import java.util.Scanner;

public class ScannerExample2 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.reset();
		
		System.out.println("이름 나이 주소를 입력해라");
		System.out.println("예) 홍길동 21 돼지시 바보구 멍청동");
		System.out.print(">");
		
		String name=sc.next();
		sc.reset();
		int age = sc.nextInt();			sc.reset();
		String address= sc.nextLine();
		
		System.out.printf(
				"이름:\t %s\n나이:\t %d\n주소:\t%s",
				name, age, address);
		sc.close();
	}

}
