package com.zerock.multi_thread;

import lombok.extern.log4j.Log4j;

@Log4j
public class BeepPrintExample3 {
	
	
	public static void main (String[] args) {
		Thread thread = new BeepThread();
		
		
		thread.start();
		
		for(int i = 0; i<5; i++) {					//main thread가 찍어내는거.
			log.info("띵");
			
			try {Thread.sleep(500);} 
			catch(Exception e ) {;;}	//try - catch
		}	//for	
		
	}	//end main

}	//end class
