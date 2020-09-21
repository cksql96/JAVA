package com.zerock.multi_thread;

import lombok.extern.log4j.Log4j;


@Log4j
//PriorityExample
public class CalcThread extends Thread{
	
	
	public CalcThread(String name) {
		this.setName(name);
	}	//constructor
	
	@Override
	public void run() {
		for(int i = 0; i <2000000000; i++ );
		
		log.info(this.getName());
	}	//run

}	//end class
