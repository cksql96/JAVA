package com.zerock.promotion;

//다형성2 : 부모타입의 변수 = 자식타입의 객체가 할당 가능하다.
public class PromotionExample {
	
	
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//-------------------------//
		
		//자동형변환 수행
		A a1 = b;	//부모타입의 참조변수에는, 자식객체의 주소가 대입 가능하다.
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//--------------------------//
		
		//자동형변환 수행.
		B b1 = d;
		C c1 = e;
		
		//--------------------------//
		
//		B b2 = e;		//부모타입이 아니므로 불가
//		C c2 = d;		
		
		
	}	//end main

}	//end class
