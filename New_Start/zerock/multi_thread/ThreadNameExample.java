package com.zerock.multi_thread;

import lombok.extern.log4j.Log4j;

@Log4j
public class ThreadNameExample {
	
	
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		log.info("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadB threadC = new ThreadB();
		log.info("worker 스레드 이름: " + threadC.getName());
		
		threadC.start();
		
		//------------------------------------------------------------------------//
		ThreadA threadA = new ThreadA();
		log.info("worker 스레드 이름: " + threadA.getName());
		
		threadA.start();
		
		//------------------------------------------------------------------------//
		ThreadB threadB = new ThreadB();
		log.info("worker 스레드 이름: " + threadB.getName());
		
		threadB.start();
		
		log.info("메인끝자리임.");
		
	}	//end main

}	//end class
