package com.zerock.casting;

import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
@Log4j
public class Bus implements Vehicle{
	
	@Override
	public void run() {
		log.info("버스가 달립니다.");
	}	// run
	
	public void checkFare() {
		log.info("승차요금 체크한다");
	}	//checkFare

}	//end class
