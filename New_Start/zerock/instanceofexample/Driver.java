package com.zerock.instanceofexample;


public class Driver {
	
	public void drive(Vehicle vehicle) {
		
		//강제형변환(즉, 부모타입->자식타입)을 수행하기 전
		//instanceof 연산자로 우선 타입을 확인하고,
		//강제형변환이 가능한지를 보고선 수행하는 안전한 코드.
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}	//if
		
	}	//drive

}	//end class
