package com.zerock.field_polymorphism;

public class DriverExample {
	
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		driver.drive(bus);
		driver.drive(taxi);
		
	}	//end main

}	//end class
