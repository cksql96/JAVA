package com.zerock.abstractexample;

public class PhoneExample {
	
	
	public static void main(String[] args) {
		//1. 추상클래스 타입의 객체 생성은 불가
//		Phone ph = new Phone();	//X
		
		//2. 자식클래스 타입의 객체 생성
		SmartPhone sp = new SmartPhone("홍길동");
		
		//3. 부모클래스로부터 상속받은 메소드와
		//자식클래스에 있는 메소드 사용
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		
	}	//end main

}	//end class
