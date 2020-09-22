package com.zerock.multi_thread.synchronizedSuccess;

import lombok.Getter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
public class Calculator {	
	private int memory;
	
//	public synchronized void setMemory(int memory) {
//		this.memory = memory;
//		
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException e) {
//			;;
//		}	//try -catch
//		
//		log.info(Thread.currentThread().getName() + ": " + this.memory);		
//	}	//setMemory, 동기화 메소드
	
	public void setMemory(int memory) {
		log.info(Thread.currentThread().getName() + ": 시작");
		
		synchronized(this){
			this.memory = memory;
			
			log.info(Thread.currentThread().getName() + ": " + this.memory);						
			
		}	//동기화 블록, synchronized block
		
		log.info(Thread.currentThread().getName() + ": 중간");	
				
		log.info(Thread.currentThread().getName() + ": 끝");		
				
	}	//setMemory
	
	
	
	

}	//end class