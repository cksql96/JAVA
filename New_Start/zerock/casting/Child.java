package com.zerock.casting;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
@AllArgsConstructor(access=lombok.AccessLevel.PRIVATE)
public class Child extends Parent{
	
	public String field2;
	public int field3;
	
	
	public void method3() {
		log.info("Child-method3()");
	}	//method3

}	//end class
