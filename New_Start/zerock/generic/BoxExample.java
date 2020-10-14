package com.zerock.generic;

import lombok.extern.log4j.Log4j;


@Log4j
public class BoxExample {
	
	
	public static void main(String[] args) {
		
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		log.info(name);
		
		//---------------------------------------//
		box.set(new Apple());
		Apple apple = (Apple) box.get();
		log.info(apple);
		
		
		
	}	//end main

}	//end class
