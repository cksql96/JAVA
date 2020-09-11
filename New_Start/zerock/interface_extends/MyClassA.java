package com.zerock.interface_extends;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class MyClassA implements MyInterface{
	
	
	@Override
	public void method1() {
		log.info("MyClassA-method1() 실행");
	}	//method1

}	//end class
