package com.zerock.ex;

import lombok.extern.log4j.Log4j;


@Log4j
public class Cellphone {
	//--필드
	String model;
	String color;
	
	
	//--생성자
	public Cellphone (String model, String color) {
		log.info("ㅁㅁㅁㅁCellphone(model, color) invoked");
		
		this.model = model;
		this.color = color;
	}	//constructor
	
	
	//--메소드
	void powerOn() { 
		log.info("전원을 켭니다");
	}	//powerOn
	
	void powerOff() { 
		log.info("전원을 끕니다");
	}	//powerOff
	
	void bell() {
		log.info("벨이 울립니다.");
	}	//bell
	
	void sendVoice(String message) {
		log.info("나 : " + message);
	}	//sendVoice
	
	void receiveVoice(String message) {
		log.info("상대방 : " + message);
	}	//receiveVoice
	
	void hangup() { 
		log.info("전화를 끊습니다.");
	}	//hangup

}	//end class
