package com.zerock.superexample;


public class SupersonicAirplaneExample {
	
	
	public static void main(String[] args) {
		
		SupersonincAirplane sa = new SupersonincAirplane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMode = SupersonincAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SupersonincAirplane.NORMAL;
		sa.fly();
		
		sa.land();
		
	}	//end main

}	//end class
