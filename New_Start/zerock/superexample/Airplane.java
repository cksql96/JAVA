package com.zerock.superexample;

import lombok.extern.log4j.Log4j;


@Log4j
public class Airplane {
	
	
	public void land() {
		log.info("착륙");
	}	//land
	
	public void fly() {
		log.info("일반비행");
	}	//fly
	
	public void takeOff() {
		log.info("이륙");
	}	//takeoff

}	//end class
