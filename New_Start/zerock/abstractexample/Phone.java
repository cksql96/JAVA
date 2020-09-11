package com.zerock.abstractexample;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public abstract class Phone {
	//필드
	public String owner;
	
	
	//생성자
	//@AllArgsConstructor로 대체.
	
	
	//메소드
	public void turnOn() {
		log.info("전원을 킨다.");
	}	//turnOn
	
	public void turnOff() {
		log.info("전원을 끈다.");
	}	//turnOff

}	//end class
