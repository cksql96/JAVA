package com.zerock.multi_thread.state.notify;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)

//멀티스레드 하에서, 스레드가 공유하는 공유객체를 만드는 클래스.
public class WorkObject {
	
	
	public synchronized void methodA() {
		log.info("ThreadA의 methodA() 입니다.");
		
		//WAITING(일시정지 상태) 스레드를 1개만 깨우자.
		notify();		
		
		//누가 깨울때까지는(notify나 notifyAll) 계속 잠잔다(기다린다)
		try{
			wait();			
		}catch(InterruptedException e) {;;}	//try-catch
		
	}	//synchronized methodA
	
	
	public synchronized void methodB() {
		log.info("ThreadB의 methodB() 입니다.");
		
		//WAITING(일시정지 상태) 스레드를 1개만 깨우자.
		notify();
		
		//누가 깨울때까지는(notify나 notifyAll) 계속 잠잔다(기다린다)
		try{
			wait();			
		}catch(InterruptedException e) {;;}	//try-catch
		
	}	//synchronized methodB	
	
	
	public synchronized void methodC() {
		log.info("ThreadC의 methodC() 입니다.");
		
		//WAITING(일시정지 상태) 스레드를 1개만 깨우자.
		notify();
		
		//누가 깨울때까지는(notify나 notifyAll) 계속 잠잔다(기다린다)
		try{
			wait();			
		}catch(InterruptedException e) {;;}	//try-catch
		
	}	//synchronized methodB	
	
	public synchronized void methodD() {
		log.info("ThreadD의 methodD() 입니다.");
		
		//WAITING(일시정지 상태) 스레드를 1개만 깨우자.
		notify();
		
		//누가 깨울때까지는(notify나 notifyAll) 계속 잠잔다(기다린다)
		try{
			wait();			
		}catch(InterruptedException e) {;;}	//try-catch
		
	}	//synchronized methodB	

}	//end class
