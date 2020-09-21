package com.zerock.multi_thread;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class ThreadB extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			log.info("\t     " + this.getName() + "가 출력한 내용");
		}	//for
		
	}	//run

}	//end class
