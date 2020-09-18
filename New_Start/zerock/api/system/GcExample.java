package com.zerock.api.system;

import lombok.extern.log4j.Log4j;


@Log4j
public class GcExample {
	
	
	public static void main(String[] args) {
		GcEmployee emp;
		
		emp = new GcEmployee(1);		//객체생성
		emp = null;						//GC의 대상이 되도록, 가비지객체로 만듦.
		
		emp = new GcEmployee(2);		//객체생성
		emp = new GcEmployee(3);		//객체생성
		
		log.info("emp가 최종적으로 참조하는 사원번호: ");
		log.info(emp.eno);
				
		//--------------------------------//
		System.gc();	//강제성이 없음.
		
	}	//end main

}	//end class
