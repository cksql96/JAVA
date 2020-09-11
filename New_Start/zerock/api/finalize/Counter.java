package com.zerock.api.finalize;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
public class Counter {
	
	private int no;

	@Override
	protected void finalize() throws Throwable {
		//원래 있던것
		//super.finalize();
		String a ="[%d]. %s destroyed.";
		log.info(String.format(a, no, this));
		Cloneable b;
	}	//finalize	
	
	
}	//end class
