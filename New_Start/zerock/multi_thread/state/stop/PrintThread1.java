package com.zerock.multi_thread.state.stop;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.log4j.Log4j;


@Log4j
@Accessors(fluent=false, chain=false)
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
//StopFlagExample
public class PrintThread1 extends Thread{
	
	@Setter(lombok.AccessLevel.PUBLIC)
	private boolean stop;			//stop flag
	
	@Override
	public void run() {
		
		//stop flag 가 true가 될때까지는 계속 looping
		while(!stop) {
			log.info("실행 중");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {;;}	//try -catch
		}	//while
		
		log.info("자원 정리 부분 예)Scanner 클래스를 썼으면, .close()를 해라");
		log.info("실행 종료");
	}	//run

}	//end class
