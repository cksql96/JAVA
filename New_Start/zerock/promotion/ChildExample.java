package com.zerock.promotion;

public class ChildExample {
	
	
	public static void main(String[] args) {
		 
		KumhoTire kumho = new KumhoTire();	//자식 객체 생성
		
		//다형성-2 : 부모타입의 참조변수에, 자식객체를 대입(자동형변환)
		Tire tire = kumho;
		
		//부모타입의 메소드 호출(parent 참조변수의 타입은 명확히 parent임)
		tire.method1();
		System.out.println();
		tire.method2();
		
		//다형성 1 : 오버라이딩 된 메소드가 호출이된다.
		
//		parent.method3();		//호출 불가능
		
	}	//end main

}	//end class
