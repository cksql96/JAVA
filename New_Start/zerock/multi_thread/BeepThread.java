package com.zerock.multi_thread;

import java.awt.Toolkit;

import lombok.extern.log4j.Log4j;

@Log4j
public class BeepThread extends Thread{
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i<5; i++) {					//main thread가 찍어내는거.
			log.info("소리가난다.");
			toolkit.beep();
			
			try {Thread.sleep(500);} 
			catch(Exception e ) {;;}	//try - catch
		}	//for	
	}

}	//end class
