package com.zerock.abstractexample;

import lombok.extern.log4j.Log4j;

@Log4j
public class Dog extends Animal{
	
	
	public Dog() {
		super();
		this.kind = "포유류";
	}	//default constructor
	
	
	@Override
	public void sound() {
		log.info("멍멍");
	}	//sound

}	//end class
