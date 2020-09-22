package com.zerock.multi_thread.synchronizedSuccess;


public class MainThreadExample {
	
	
	public static void main(String[] args) {
		//1. 스레드 간 공유 객체 생성
		Calculator calc = new Calculator();
		
		//2. 공유객체를 사용할 worker thread 생성
		User1 user1 = new User1();
		user1.setCalculator(calc);		//공유객체 참조전달
		user1.start();					//스레드 구동
		
		//3. 공유객체를 사용할 worker thread 생성
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user2.start();
		
		User3 user3 = new User3();
		user3.setCalculator(calc);
		user3.start();
		
	}	//end main

}	//end class
