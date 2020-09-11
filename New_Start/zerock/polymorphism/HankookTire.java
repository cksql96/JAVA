package com.zerock.polymorphism;

import lombok.extern.log4j.Log4j;


@Log4j
public class HankookTire extends Tire{
	//필드
	
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	//constructor
	
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			log.info(location + " HankookTire 수명 : " 
					+ (maxRotation-accumulatedRotation) + "회");
			
			return true;
		}else {
			log.info("*** " + location + " HankookTire 펑크 ***");
			
			return false;
		}	// if-else
		
	}	//roll

}	//end class
