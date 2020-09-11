package com.zerock.polymorphismmethod;

import lombok.extern.log4j.Log4j;


@Log4j
public class Taxi extends Vehicle{
	
	@Override
	public void run() {
		log.info("택시가 달립니다.");
	}	//run

}	//end class
