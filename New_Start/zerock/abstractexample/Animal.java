package com.zerock.abstractexample;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public abstract class Animal {
	//필드
	public String kind;
	
	
	//생성자
	
	
	//메소드
	public void breathe() {
		log.info("숨을쉰다");
	}	//breathe
	
	public abstract void sound();
	
}	//end class
