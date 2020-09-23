package com.zerock.multi_thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import lombok.extern.log4j.Log4j;


@Log4j
public class ExecuteVsSubmitExample {
	
	
	public static void main(String[] args) throws Exception {
		
		ExecutorService executorService =
				Executors.newFixedThreadPool(2);		//스레드풀 생성
		//ExecutorService라는 인터페이스에, Executors 라는 헬퍼클래스 의 메소드중 ThreadPool을 소환하여,
		//2 라는 숫자의 스레드를 만든다. -> 총 2개의 스레드를 만들고, 그걸로 수행한다.
		
		log.info("- executorService : " + executorService);
		
		//----------------------------//
		
		//스레드풀을 이용하여, 10개의 task를 생성하고,
		//이를 스레프풀의 JobQ에 넣어서 수행시킴(위임)
		for(int i = 0; i <10; i++) {
			
			Runnable task = new Runnable() {
				
				@Override
				public void run() {
					//스레드 총 개수(executors.~~(2)) 및 작업 스레드 이름
					//실제 스레드 풀의 구현 클래스 : ThreadPoolExecutor
					ThreadPoolExecutor threadPoolExecutor = 
							(ThreadPoolExecutor) executorService;
					
					//현재 스레드 풀의 사이즈(크기)
					int poolSize = threadPoolExecutor.getPoolSize();
					
					//현재의 코드를 수행시키는 Worker Thread의 이름 획득
					String threadName = Thread.currentThread().getName();
					
					log.info("[총 스레드 개수: " + poolSize + "] 작업스레드 이름: " + threadName);
					
					//의도적으로 예외 발생시킴
					int value = Integer.parseInt("삼");		//NumberFormatException					
				}	//run				
			};	//익명구현객체 코딩기법으로, Task 생성	
			
			//------------------------------------------------//
			
//			executorService.execute(task);		//스레드풀의 JobQ에 Task 제출		//예외 그대로 발생
			executorService.submit(task);		//스레드풀의 JobQ에	Task 제출		//실행시 전체에 try-catch자동으로 넣음
			
			
			Thread.sleep(10);					//TIMED_WAITING
			
		}	//for		
		log.info("- executorService : " + executorService);
		
		//------------------------------------------------//
		executorService.shutdown();				//스레드 풀 종료(자원해제)		.close말고 shutdown()이다.
		
	}	//end main

}	//end class
