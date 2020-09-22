package com.zerock.multi_thread.state;

import lombok.extern.log4j.Log4j;

@Log4j
//ThreadA, ThreadB
public class ThreadABYieldExample {
	
	
	public static void main(String[] args) {
		
		ThreadA thA = new ThreadA();		//쓰레드A 생성(NEW)
		ThreadB thB = new ThreadB();		//쓰레드B 생성(NEW)
		
		//--------------------------------------------------------//
		thA.start();						//쓰레드A구동(NEW -> RUNNABLE)
		thB.start();						//쓰레드B구동(NEW -> RUNNABLE)
		
		//--------------------------------------------------------//
		//main 스레드 상태제어 : Running -> Timed_Waiting
		try {
			Thread.sleep(1200);
		}catch(InterruptedException e) {;;}	//try -catch	
		//main 스레드 상태제어 : Timed_Waiting -> Running
		
		log.info("스레드A의 work를 false로 바꾼다. 양보한다->a스레드 일 안한다. -> 출력안한다.");
		log.info("스레드B는 그대로 work가 true이므로, 출력한다.");
		thA.work = false;					//work를 false로(b작업해라)
//		log.info("스레드A의 work를 false로 바꿨다. 양보한다->b를 작업한다.");
		
		//--------------------------------------------------------//
		//main 스레드 상태제어 : Running -> Timed_Waiting
		try {
			Thread.sleep(1200);
		}catch(InterruptedException e) {;;}	//try -catch
		//main 스레드 상태제어 : Timed_Waiting -> Running
		
		log.info("스레드A의 work를 true로 바꾼다.양보한다->a스레드 다시일한다. -> 출력한다.");
		log.info("스레드B는 그대로 work가 true이므로, 출력한다.");
		thA.work = true;					//work를 true로(a작업해라)
//		log.info("스레드A의 work를 true로 바꿨다.양보한다->a를 작업한다.");		
		
		//--------------------------------------------------------//
		//main 스레드 상태제어 : Running -> Timed_Waiting
		try {
			Thread.sleep(1200);
		}catch(InterruptedException e) {;;}	//try -catch
		//main 스레드 상태제어 : Timed_Waiting -> Running
		
		log.info("스레드A와 스레드B의 stop을 true로 바꾼다. -> while loop를 빠져나온다.");
		log.info("while loop 밖에는 종료 출력있고, 그다음에 암것도 없으므로, 자연히 종료");
		thA.stop = true;			//스레드B stop을 true로(종료하라)
		thB.stop = true;			//스레드B stop을 true로(종료하라)
		
	}	//end main

}	//end class
