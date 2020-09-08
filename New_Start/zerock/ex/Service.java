package com.zerock.ex;

import lombok.extern.log4j.Log4j;

@Log4j
public class Service {
	
	//@를 찍고 어노테이션을 작성하면, 적용된다.
	//@없이 작성을 하면 그냥 클래스 이름을 사용한다.
	
	@PrintAnnotation
	public void method1() {
		log.info("실행 내용1");
	}	//method1
	
	@PrintAnnotation("*")
	public void method2() {
		log.info("실행 내용2");
	}	//method2
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}	//method3
	
	public void method4() {
		System.out.println("실행 내용4");
	}	//method4

}	//end class
