package com.zerock.polymorphism;

import lombok.extern.log4j.Log4j;

@Log4j
public class Car {
	
	//1필드 (부품객체)
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	//2.생성자
	
	//3.메소드
	int run() {
		log.info("[자동차가달립니다.]");
		
		for(int i = 0; i < tires.length; i++) {
			
			if(tires[i].roll() == false) {
				stop();
				
				return(i+1);
			}	//if
		}	//for
		
		return 0;
	}	//run
	
	void stop() {
		log.info("[멈춥니다]");
	}	//stop

}	//end class
