package com.zerock.multi_thread;

import java.awt.Toolkit;

import lombok.extern.log4j.Log4j;

@Log4j
public class BeepTask implements Runnable{

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		
		log.info("\t     " + currentThread);
		log.info("\t     BeepTask run 메소드호출");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i <5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} 
			catch(Exception e ) {;;}	//try - catch
		}	//for
		
	}	//run	

}	//end clas
