package com.zerock.polymorphismmethod;

import lombok.extern.log4j.Log4j;


public class DriverExample {
	
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();	//운전자 생성
		
		Bus bus = new Bus();			//버스 생성
		Taxi taxi = new Taxi();			//택시 생성
		
		driver.drive(bus);				//운전자가 버스를 운전
		driver.drive(taxi);				//운전자가 택시를 운전
		
	}	//end main

}	//end class
