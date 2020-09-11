package com.zerock.field_polymorphism;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class Bus implements Vehicle{

	@Override
	public void run() {
		log.info("버스가 달립니다.");
	}	//run
	
}	//end class
