package com.zerock.finalexample;

import lombok.extern.log4j.Log4j;


@Log4j
public class Car {
	//필드
	public int speed;
	
	
	//생성자
	
	
	//메소드
	public void speedUp() {
		speed += 1;
	}	//speedUp
	
	public final void stop() {
		log.info("차를 멈춤");
		
		speed = 0;
	}	//stop

}	//end class
