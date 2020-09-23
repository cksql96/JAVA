package com.zerock.multi_thread.state.stop;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
//InterruptExample
public class PrintThread2 extends Thread {
	
	
	@Override
	public void run() {
		
		//----------------1st method----------------//
		try {
			while(true) {
				log.info("실행 중");
				
				Thread.sleep(1);				
			}	//while
		}catch(InterruptedException e) {
			log.info("예외 발생했다 - interrupt signal 받았다.");
			
		} 	//try - catch
		
		//----------------2nd method----------------//
		
		
//		while(true) {
//			log.info("실행 중");
//						
//			//이전에 이미 Interrupt Signal 이 수신되었는지 확인
//			//true 일경우, Interrupt Signal 수신된적 있다라는 의미.
//			if(Thread.interrupted()) {
//				break;
//			}	//if
//			
//		}	//while
		
		log.info("자원 정리");
		log.info("실행 종료");
	}	//run

}	//end class

