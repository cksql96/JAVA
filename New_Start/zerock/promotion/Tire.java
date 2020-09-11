package com.zerock.promotion;

import lombok.extern.log4j.Log4j;

@Log4j
public class Tire {
	
	public void method1() {
		log.info("Parent-method1()");
	}	//method1
	
	public void method2() {
		log.info("Parent.method2()");
	}	//method2

}	//end class
