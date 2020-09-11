package com.zerock.interfaceexample;

import lombok.extern.log4j.Log4j;


@Log4j
public class RemoteControlExample {
	
	
	public static void main(String[] args) {
		//interface 타입의 지역변수 선언 및 초기화
		RemoteControl rc = null;
		log.info(rc);
		System.out.println();
		
		rc = new Television();
		
		log.info(rc);
		rc.turnOn();
		rc.setMute(true);
		RemoteControl.changeBattery();
		
		System.out.println();
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setMute(true);
		
	}	//end main

}	//end class
