package com.zerock.multi_thread.state.stop;

public class InterruptExample {
	
	
	public static void main(String[] args) {
		
		Thread thread = new PrintThread2();			//상태 NEW
		thread.start();								//상태 RUNNABLE
		
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {;;}	//try -catch
		
		thread.interrupt();
		
	}	//end main

}	//end class
