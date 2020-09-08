package com.zerock.superexample;

import lombok.extern.log4j.Log4j;


@Log4j
public class SupersonincAirplane 
	extends Airplane {
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			//만약 supersonic이라면, 초음속이라고 말함.
			log.info("초음속비행");
		} else {
			//부모객체 fly 호출
			super.fly();
		}	//if-else
		
	}	//fly

}	//end class
