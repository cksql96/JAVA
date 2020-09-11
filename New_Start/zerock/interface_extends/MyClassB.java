package com.zerock.interface_extends;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class MyClassB implements MyInterface{
	
	@Override
	public void method1() {
		log.info("MyClassB-method1() 실행");
	}	//method1
	
	@Override
	public void method2() {
		log.info("MyClassB-method2() 실행");
	}	//method2
	
}	//end class
