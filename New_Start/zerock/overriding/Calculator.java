package com.zerock.overriding;

import lombok.extern.log4j.Log4j;


@Log4j
public class Calculator {
	
	
	double areaCircle(double r) {
		log.info("Calculator 객체의 areaCircle() 실행");
		
		return 3.14159 * r * r;
	}	//area Circle

}	//end class
