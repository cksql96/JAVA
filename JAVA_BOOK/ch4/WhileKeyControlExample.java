package ch4;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			if(keyCode != 13 && keyCode !=10) {
				System.out.println("----------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("----------------------");
				System.out.println("선택 : ");
			}
		
			keyCode = sc.nextInt();
			System.out.println(keyCode);
			if(keyCode == 1)
			{
				speed++;
				System.out.println("현재 속도 = " +speed);
			}
			else if(keyCode == 2)
			{
				speed--;
				System.out.println("현재 속도 = " +speed);
			}
			else if(keyCode == 3) 
			{
				System.out.println("프로그램을 종료합니다!");
				run = false;
			}
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		
	}

}
