package com.zerock.generic;

import lombok.extern.log4j.Log4j;

@Log4j
public class Gen_BoxExample {
	
	
	public static void main(String[] args) {
		//제네릭 클래스를 사용할때!
		
		//타입 파라미터에 타입으로 String 지정
		//(이것이 구제척인 타입, 즉 구체타입이다.)
//		Gen_Box<String> box1 = new Gen_Box<String>();		//JDK5~JDK7
		Gen_Box<String> box1 = new Gen_Box<>();					//<>연산자 : 타입 추론.
		//<>연산자: 타입추론 연산자를 사용할 수 없는 때(구체타입의 생략 불가능할때)
		//=> 익명 구현 객체, 익명 자식 객체에, 제네릭타입을 사용할때, RValue구체타입 생략불가 
		
		box1.set("hello");
		String str = box1.get();
		
		log.info(str);
		//------------------------------------------//
		Gen_Box<Integer> box2 = new Gen_Box<Integer>();
		
		box2.set(6);
		int value = box2.get();
		log.info(value);
		
		//------------------------------------------//
		Gen_Box<Apple> box3 = new Gen_Box<Apple>();
		box3.toString();
		
		
	}	//end main

}	//end class
