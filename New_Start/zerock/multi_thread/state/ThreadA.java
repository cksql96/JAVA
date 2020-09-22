package com.zerock.multi_thread.state;

import lombok.extern.log4j.Log4j;

@Log4j
//ThreadABYieldExample
public class ThreadA extends Thread{
	
	//쓰레드를 종료할지 말지 지정
	public boolean stop = false;
	
	//작업을 수행할지 말지 지정
	public boolean work = true;
	
	
	@Override
	public void run() {
		while(!stop) {	//쓰레드를 종료하라고 하기 전까지 무한반복
			
			if(work) {	//작업을 수행하라 라고 할때 작업수행
				log.info("Thread A 작업내용");
			} else {	//작업을 수행하지 말라라고 할때 실행을 양보
				Thread.yield();		//실행을 양보
			}	//if-else
			
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {;;}	//try -catch
			
		}	//while
		
		log.info("Thread A 종료");
	}	//run

}	//end class
