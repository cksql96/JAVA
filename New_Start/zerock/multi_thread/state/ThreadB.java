package com.zerock.multi_thread.state;

import lombok.extern.log4j.Log4j;

@Log4j
//ThreadABYieldExample
public class ThreadB extends Thread{
	
	public boolean stop = false;
	public boolean work = true;
	
	
	@Override
	public void run() {
		while(!stop) {
			
			if(work) {
				log.info("Thread B 작업내용");
			}else {
				Thread.yield();
			}	//if-else
			
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {;;}	//try -catch
			
		}	//while
		
		log.info("Thread B 종료");
		
	}	//run

}	//end class
