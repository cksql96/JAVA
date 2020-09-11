package com.zerock.casting;

public class VehicleExample {
	
	
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); //x
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
				
	}	//end main

}	//end class
