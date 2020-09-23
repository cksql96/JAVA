package com.zerock.multi_thread.daemon;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class AutoSaveThread extends Thread{
	
	public void save() {
		log.info("작업내용을 저장");		
	}	//save
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(200);
			}catch (InterruptedException e) {
				log.info(this.getName() + " interrupted");
				
				break;			//Interrupt Signal 받으면 예외발생
			}	//try -catch
			
			save();		//저장
			
		}	//while
		
	}	//run

}	//end class
