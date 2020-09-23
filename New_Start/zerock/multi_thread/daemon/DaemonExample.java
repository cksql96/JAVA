package com.zerock.multi_thread.daemon;

import lombok.extern.log4j.Log4j;


@Log4j
public class DaemonExample {
	
	
	public static void main(String[] args) {
		AutoSaveThread autoSave = new AutoSaveThread();		//NEW
		
		autoSave.setDaemon(true);			//데몬스레드로 변경
		autoSave.start();					//RUNNABLE
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {;;}	//try catch
		
		log.info("메인 스레드 종료");		
		
	}	//end main

}	//end class
