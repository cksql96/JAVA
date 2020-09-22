package com.zerock.multi_thread.state;

import lombok.extern.log4j.Log4j;

@Log4j
//SumThread
public class JoinExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		log.info("시작");
		Thread mainThread = Thread.currentThread();
		SumThread sumThread = new SumThread(mainThread);			//스레드 객체 생성		NEW
		sumThread.start();								//스레드 구동 시작		RUNNABLE
		
		
		//지정된 스레드가 종료될때까지는 기다려라!!(일시정지상태)		
		sumThread.join();			//이 스레드(SumThread의 내용이 모두 끝날때까지 main Thread는 기다려라)
									//지금 있는게 main빼고, worker쓰레드가,  SumThread 하나라 그렇지, 
									//worker가 늘면 무작위로 수행이 되는데, 이때 join을 쓰면 나머지는 다 기다린다.
		//위에꺼를 주석처리 하면, 메인 다 끝나고 나서, sumThread가 실행되는데,
		//주석풀면, Thread먼저 수행.
		
		
		
//		log.info("1~100의 합: " + sumThread.getSum());
		log.info("끝");		
	}	//end main

}	//end class
