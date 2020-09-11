package com.zerock.polymorphism;

import lombok.extern.log4j.Log4j;


@Log4j
public class Tire {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}//constructor
	
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			log.info(location + " tire 수명: " 
					+(maxRotation-accumulatedRotation) + "회");
			
			return true;
		}
		else {
			log.info("*** " + location + " Tire 펑크 ***");
			
			return false;
		}	//if-else
		
	}	//roll

}	//end class
