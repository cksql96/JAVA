package com.zerock.multi_thread.state;

import lombok.extern.log4j.Log4j;

@Log4j
//ThreadStateExample
public class TargetThread extends Thread{
	
	@Override
	public void run() {
		for(long i=0; i<1000000000; i++);	//10억번 loop 수행
		log.info("1번째 for룹 수행 끝");
		log.info("1000밀리초, 1초 잔다");
		try {
			//1.5초간 일시정지
			Thread.sleep(1000);
		}catch(Exception e) {;;}		//try-catch
		log.info("일어났다");
		
		for(long i=0; i<1000000000; i++);	//10억번 loop 수행
		log.info("2번째 for룹 수행 끝");
		
	}	//run

}	//end class
