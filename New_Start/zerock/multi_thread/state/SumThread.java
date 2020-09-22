package com.zerock.multi_thread.state;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
//JoinExample
public class SumThread extends Thread{
	
	@Getter
	@Setter
	private long sum;
	private Thread mainThread;
	
	
	public SumThread(Thread mainThread) {
		this.mainThread = mainThread;
	}	//constructor
	
	@Override
	public void run() {
		Objects.requireNonNull(mainThread);
		log.info("- mainThread: " + mainThread.getState());
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}	//for
		log.info("run 끝");		
	}	//run

}	//end class
