package com.zerock.overriding;

import lombok.extern.log4j.Log4j;


@Log4j
public class Computer 
	extends Calculator {
	
	
	@Override
	double areaCircle(double r) {
		log.info("Computer 객체의 areaCircle() 실행");
		
		return Math.PI * r * r;
	}	//areaCircle

}	//end class
