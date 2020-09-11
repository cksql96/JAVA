package com.zerock.polymorphism;

import lombok.extern.log4j.Log4j;


@Log4j
public class CarExample {
	
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i=1;i<=5;i++) {			
			int problemLocation = car.run();
			
//			switch(problemLocation) {} // 세세한 조작을 하고프면 if 나 switch로 늘리면 된다.
			if(problemLocation != 0) {
				log.info(car.tires[problemLocation-1].location + " HankookTires로 교체");
				
				car.tires[problemLocation-1] = 
						new HankookTire( car.tires[problemLocation-1].location,
								15 );
			}
			log.info("-----------------------------------------");
			
		}	//for		
		
	}	//end main

}	//end class
