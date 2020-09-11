package com.zerock.abstractexample;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
public class SmartPhone extends Phone{
	
	//필드
	
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}	//constructor
	//메소드
	public void internetSearch() {
		log.info("인터넷 검색");
	}	//internetSearch

}	//end class
