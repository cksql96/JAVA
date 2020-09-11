package com.zerock.field_polymorphism;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class Car {
	//다형성1 조립할 부품조립
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		//다형성2 : 재정의된 자식객체의 메소드가 호출
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}	//run

}	//end class
