package com.zerock.generic.method;

import lombok.extern.log4j.Log4j;

@Log4j
public class BoxingMethodExample {
	
	
	public static void main(String[] args) {
		
		Box<Integer> box1 = Util.<Integer>boxing(100);
		
		//Box<Integer> box1은 Box클래스의 제네릭을 지정해주는것이고,
		//Util.<Integer>boxing(100)은 Util 메소드의 타입을 지정해준다.
		
		int intValue = box1.getBx();
		
		log.info(intValue);
		
		//---------------------------------------//
		
		Box<String> box2 = Util.boxing("홍길동");
		
		String strValue = box2.getBx();
		
		log.info(strValue);		
		
		//---------------------------------------//
		
		Box<Short> box3 = Util.<Short>boxing((short)50);
		
		short a = box3.getBx();
		
		log.info(a);		
		
	}	//end main

}	//end class
