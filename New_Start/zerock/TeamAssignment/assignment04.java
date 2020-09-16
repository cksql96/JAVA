package TeamAssignment;

import java.util.Scanner;

public class assignment04 {
	
	
	public static void main(String[] args) {
		
//		1. N에 2를 입력받으면 2x1 ~ 10
//		2. for문을 써야될것같다 !
//		3. 라인별로 출력
//	  ------------------------
		//result = x * y 10번 반복.
		//sysout(n * i = (n*i))
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해");
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			 
			System.out.println(n+" x "+i+" = "+(n*i));
			
		} // for
		
		sc.close();
	}

}
