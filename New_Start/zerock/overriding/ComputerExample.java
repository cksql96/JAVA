package com.zerock.overriding;

import lombok.extern.log4j.Log4j;


@Log4j
public class ComputerExample {
	
	
	public static void main(String[] args) {
		int r = 10;
		
		//부모 객체 생성
		Calculator cal = new Calculator();
		
		//부모객체의 인스턴스 메소드 호출
		log.info("원면적 : " + cal.areaCircle(r));
		System.out.println();
		
		//--------------------------------------------//
		
		//자식객체의 생성
		Computer com = new Computer();
		
		//자식객체의 인스턴스메소드 호출
		log.info("원면적 : " + com.areaCircle(r));
		
	}	//end main
		
}	//end class
