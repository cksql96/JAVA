package com.zerock.field_polymorphism;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class Driver {
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}	//drive

}	//end class
