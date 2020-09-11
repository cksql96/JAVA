package com.zerock.instanceofexample;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.extern.log4j.Log4j;


//@Value
//@Data
@ToString
@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
//@AllArgsConstructor
public class TTT extends Child{
	
	@NonNull String name;
	int age;
	boolean gender;
	static String national = "대한민국";
	static final double PI = 3.14159;
	
	
	public void instanceMethod() {
		;;
	}	//instanceMethod
	
	public static void staticMethod() {
		;;
	}	//staticMethod
	
	
	//------MAIN-----------//
	public static void main(String[] args) {
		TTT t = new TTT();
		log.info(t);
		
	}	//end main

}	//end class
