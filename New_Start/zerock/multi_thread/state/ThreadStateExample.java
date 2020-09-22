package com.zerock.multi_thread.state;


//StatePrintThread, TargetThread
public class ThreadStateExample {
	
	
	public static void main(String[] args) {
		
		//스레드 객체 생성(NEW상태임)
		StatePrintThread sPT = new StatePrintThread(new TargetThread());
		//targetThread를 수행하는데(생성자로 TargetThread), 객체는 StatePrintThread.
		
		
		sPT.start();	//스레드 구동
		
	}	//end main

}	//end class
