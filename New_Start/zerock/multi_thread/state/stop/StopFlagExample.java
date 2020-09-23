package com.zerock.multi_thread.state.stop;

public class StopFlagExample {
	
	
	public static void main(String[] args) {
		
		PrintThread1 printThread = new PrintThread1();			//스레드 상태 NEW
		printThread.start();									//스레드 상태 RUNNABLE
		
		//--------------------------------------------//
		
		try {
			Thread.sleep(1000);				//main-Thread가 잔다는뜻.
		}catch(InterruptedException e) {;;}	//try-catch
		
		//-----------------------------------//
		
		//스레드의 stop flag 변경(종료하라)
		printThread.setStop(true);
		
	}	//end main

}	//end class
