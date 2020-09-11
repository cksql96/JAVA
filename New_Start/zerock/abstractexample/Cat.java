package com.zerock.abstractexample;

import lombok.extern.log4j.Log4j;


@Log4j
public class Cat extends Animal{
	
	
	public Cat() {
		super();
		this.kind = "포유류";
	}	//default constructor
	
	
	@Override
	public void sound() {
		log.info("야옹");
	}	//sound

}	//end class
