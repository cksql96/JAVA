package com.zerock.ex;

import lombok.extern.log4j.Log4j;

@Log4j
public class EarthExample {
	
	
	public static void main(String[] args) {
		log.info("지구의 반지름 : " + Earth.EARTH_RADIUS + " km");
		log.info("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA+ " km");
		
	}	//end main

}	//end class
