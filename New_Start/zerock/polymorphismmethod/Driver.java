package com.zerock.polymorphismmethod;


public class Driver {	//Vehicle 객체를 사용하는 클래스
	
	//매개변수의 다형성!
	//이 메소드가 호출되려면, 매개변수타입에 맞는 객체가
	//전달인자로 와야함.맞는 객체는 Vehicle타입의 객체이거나
	//아님 다형성2에 의해서, 자식객체가 와야함
	//다형성2 : 부모타입의 변수에 자식객체의 대입 가능
	public void drive(Vehicle vehicle) {
		vehicle.run();	//부모클래스에 정의된 메소드 호출
	}	//drive

}	//end class
