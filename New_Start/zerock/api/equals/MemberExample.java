package com.zerock.api.equals;

import lombok.extern.log4j.Log4j;

@Log4j
public class MemberExample {
	
	
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		log.info(obj1);
		
		System.out.println();
		
		if(obj1.equals(obj2)) {
			log.info("obj1 == obj2");
		} else {
			log.info("obj1 != obj2");
		}	//if -else
		
		if(obj1.equals(obj3)) {
			log.info("obj1 == obj3");
		} else {
			log.info("obj1 != obj3");
		}	//if -else
		
		if(obj2.equals(obj3)) {
			log.info("obj2 == obj3");
		} else {
			log.info("obj2 != obj3");
		}	//if -else
		
	}	//end main

}	//end class
