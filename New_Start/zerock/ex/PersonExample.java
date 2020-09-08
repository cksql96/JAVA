package com.zerock.ex;

import lombok.extern.log4j.Log4j;

@Log4j
public class PersonExample {
	
	
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		log.info(p1.nation);
		log.info(p1.ssn);
		log.info(p1.name);
				
//		p1.nation="USA";
//		p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
		
		Person p2 = new Person("234567-2345678", "계백2");
		
		
	}	//end main

}	//end class
