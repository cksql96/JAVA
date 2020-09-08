package com.zerock.ex;

public class Person {
	//-----------------------------------//
	//인스턴스 필드
	
	//final 필드(상수) 정의
	final String nation = "Korea";
	final String ssn;
	
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}	//constructor

}	//end class
