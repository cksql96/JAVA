package com.zerock.multi_thread.state;

import java.awt.Toolkit;

//just alone.
public class SleepExample {
	
	
	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 10; i ++) {
			toolkit.beep(); System.out.print("벨이 울렸어여!!  ");
			
			try {
				//3초간 일시정지 (Timed_waiting)
				Thread.sleep(1000);
			} catch(InterruptedException e ) {;;} 	//try - catch
			
		}	//for		
		
	}	//end main

}	//end class
