package com.zerock.multi_thread.state;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
//ThreadStateExample
public class StatePrintThread extends Thread{
	private Thread tgTd;	
	//AllargsConstructor로 인해, tgTd = 매개변수값이 된다.
	//메인에서 TargetThread로 해놓았으므로, tgTd는 TargetThread의 주소값을 가지게된다.	

	@Override
	public void run() {
		
		while(true) {
			Thread.State state = tgTd.getState();
			log.info("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) {		//NEW 상태라면,(쓰레드를 만들었다면?)
				tgTd.start();
			}	//if
			
			if(state == Thread.State.TERMINATED) {	//종료상태라면,
				break;
			}	//if
			
			try {	//0.1초간 일시정지, Timed-waiting
				Thread.sleep(100);					//얘로인해, 0.1초일시정지후, 다시 위로 올라감.
			}catch(Exception e) {;;} 	//try -catch
			
		}	//while
		
	}	//run	

}	//end class
