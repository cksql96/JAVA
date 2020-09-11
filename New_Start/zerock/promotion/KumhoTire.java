package com.zerock.promotion;

import lombok.extern.log4j.Log4j;

@Log4j
public class KumhoTire extends Tire{
	
	
	@Override
	public void method2() {
		log.info("Child-method2()");
	}	//method2
	
	public void method3() {
		log.info("Child-method3()");
	}	//method3
	
}	//end class
