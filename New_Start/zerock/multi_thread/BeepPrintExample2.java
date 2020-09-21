package com.zerock.multi_thread;

import java.awt.Toolkit;

import lombok.extern.log4j.Log4j;

@Log4j
public class BeepPrintExample2 {
	
	
	public static void main(String[] args) {
		// 스레드 생성방법 첫번째
		Runnable beepTask = new BeepTask();			//task 객체 생성
		Thread thread1 = new Thread(beepTask);		//worker thread 생성
		
		
		
		//--------------------------------------------------------------------------------//
		// 스레드 생성방법 두번째
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Thread currentThread = Thread.currentThread();
				
				log.info(currentThread);
				log.info("익명구현객체의 run 메소드호출");
				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i = 0; i<5; i++) {					
					toolkit.beep();
					
					try {Thread.sleep(500);} 
					catch(Exception e ) {;;}	//try - catch
				}	//for				
			}	//run
			
		});	//익명구현객체
		
		
		//--------------------------------------------------------------------------------//		
		//스레드 생성방법 세번째
		
		Thread thread3 = new Thread(() -> {
			Thread currentThread = Thread.currentThread();
			
			log.info(currentThread);
			log.info("익명함수의 run 메소드호출");
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for(int i = 0; i<5; i++) {					
				toolkit.beep();
				
				try {Thread.sleep(500);} 
				catch(Exception e ) {;;}	//try - catch
			}	//for	
			
		});	//익명함수 생성코딩기법(람다식 이용)	
		
		//--------------------------------------------------------------------------------//
		//스레드 생성방법 네번째
		Thread thread4 = new Thread() {
			
			@Override
			public void run() {
				Thread currentThread = Thread.currentThread();
				
				log.info(currentThread);
				log.info("익명자식객체의 run 메소드호출");
				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i = 0; i<5; i++) {					
					toolkit.beep();
					
					try {Thread.sleep(500);} 
					catch(Exception e ) {;;}	//try - catch
				}	//for				
			}	//run
			
		};	//익명자식객체		
		
		//--------------------------------------------------------------------------------//
		thread1.start();								//worker thread 실행
		thread2.start();
		thread3.start();
		thread4.start();
		
		for(int i = 0; i<5; i++) {					//main thread가 찍어내는거.
			log.info("띵");
			
			try {Thread.sleep(500);} 
			catch(Exception e ) {;;}	//try - catch
		}	//for		
		
	}	//end main

}	//end class
