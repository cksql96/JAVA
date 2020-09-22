package com.zerock.multi_thread.synchronizedFail;

import lombok.Getter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
public class Calculator {
	
	private int memory;
	
	public void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			;;
		}	//try -catch
		
		log.info(Thread.currentThread().getName() + ": " + this.memory);
		
	}	//setMemory
	
}	//end class