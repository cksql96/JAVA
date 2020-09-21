package com.zerock.multi_thread;

import java.awt.Toolkit;
import lombok.extern.log4j.Log4j;


@Log4j
public class BeepPrintExample1 {
	
	
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				log.info("캐치 잡혔나유?");
			}	//try - catch
		}	//for
		
		//--------------------------------------//
		
		for(int i = 0; i<5; i++) {
			log.info("머리가 띵");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				log.info("캐치 잡혔나유?2");
			}	//try - catch
		}	//for
		
		
	}	//end main

}	//end class
