package com.zerock.finalexample;

import lombok.extern.log4j.Log4j;


@Log4j
public class SportsCar 
	extends Car{
	
	
	@Override
	public void speedUp() {
		speed += 10;
	}	//speed Up
	
	//final 메소드는 오버라이딩 할수 없다.
//	@Override
//	public void stop() {
//		log.info("스포츠카를멈춤");
//		
//		speed = 0;
//	}	//stop
	
}	//end class
