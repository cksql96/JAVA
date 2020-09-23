package com.zerock.multi_thread.blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lombok.extern.log4j.Log4j;

@Log4j
public class NoResultExample {
	
	
	public static void main(String[] args) {
		//현재 시스템의 CPU core 개수만큼만의 최대 스레드를 가지는
		//스레드 풀 생성
		ExecutorService executorService =
			Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		
		//------------------------------------------//
		
		log.info("[작업 처리 요청]");
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				
				for(int i = 1; i <=10; i++) {
					sum += i;
				}	//for
				log.info("[처리결과] " + sum);
			}	//run
			
		};	//익명구현객체 코딩기법으로, Runnable 타입의 Task 생성
		
		//-------------------------------//
		
		//스레드 풀에 생성한 Task의 처리 의뢰(즉, JobQ에 task제출)
		Future future = executorService.submit(task);
		
		//------------------------------//
		
		//Future 객체를 통해, 의뢰한 Task의 처리결과를 받음
		try {
			future.get();
			log.info("[작업처리완료]");
		} catch(Exception e) {
			log.info("[실행 예외 발생함] " + e.getMessage());
		}	//try- catch
		
		//-----------------------------//
		//스레드 풀 종료
		executorService.shutdown();		
		
	}	//end main	

}	//end class
