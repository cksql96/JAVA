package com.zerock.polymorphism;

import lombok.extern.log4j.Log4j;


@Log4j
public class KumhoTire extends Tire{
	//필드
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	//constructor
	
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			log.info(location + " KumhoTire 수명 : " 
					+ (maxRotation-accumulatedRotation) + "회");
			
			return true;
		} else {
			log.info("*** " + location + " Kumhotire 펑크 ***");
			
			return false;
		}	// if-else
		
	}	//roll

}	//end class
