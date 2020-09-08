package com.zerock.ex;

import lombok.extern.log4j.Log4j;

@Log4j
public class SingletonExample {
	
	
	
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
				
		
		if(obj1 == obj2) {
			log.info("같은 Singleton 객체");
		} else {
			log.info("다른 Singleton");
		}	//if - else
		
	}	//end main


}	//end class
