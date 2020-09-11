package com.zerock.instanceofexample;

import lombok.extern.log4j.Log4j;

@Log4j
public class InstanceofExample {
	
	
	//instanceof 연산자를 사용하여, 매개변수에 저장된 객체의
	//타입을 확인, parent매개변수에 전달된 객체의 타입이 Child타입인가?
	public static void method1(Parent parent) {
		
		//true라면, Child타입객체이다.
		if(parent instanceof Child) {
			//강제형변환
			Child child = (Child) parent;
			log.info("method1 - Child로 변환성공");
		}else {
			log.info("method1 - Child로 변환실패");
		}	//if - else
	}	//method 1
	
	//이 메소드는 매개변수에 저장된 객체의 타입을 확인하지 않고 무조건
	//강제형변환 시도하는 안전하지않은(Insecure code) 코드를 보여줌.
	public static void method2(Parent parent) {
		//강제 형변환
		Child child = (Child) parent;
		log.info("method2 - Child로 변환성공");
	}	//method2
	
	//-----MAIN--------//
	public static void main(String[] args) {
		
		//자동형변환~
		Parent pa1 = new Child();
		
		log.info("method1실행한다잉");
		method1(pa1);		//instanceof 연산자 사용
		log.info("method2실행한다잉");
		method2(pa1);		//무조건 강제형변환
		
		System.out.println();
		//----------------//
		Parent pa2 = new Parent();
		
		log.info("method1실행한다잉");
		method1(pa2);
		log.info("method2실행한다잉");
		method2(pa2);
		
	}	//end main

}	//end class
