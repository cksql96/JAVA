package com.zerock.multi_thread;

import lombok.extern.log4j.Log4j;

@Log4j
public class ThreadA extends Thread{
	
	
	public ThreadA() {
		this.setName("ThreadA");		//스레드 이름 변경(자식메소드인 setName으로->Thread를 extends해서 다 갖고있다.)
//		super.setName("ThreadA");		//스레드 이름 변경(부모메소드인 setName으로)
	}	//constructor
	
	@Override
	public void run() {
		for(int i = 0; i <2; i++) {
			log.info("\t     " + this.getName() + "가 출력한 내용");	//자식의 getName을 쓴다.
//			log.info(super.getName() + "가 출력한 내용");	//부모의 getName을 쓴다.
		}	//for
	}	//run

}	//end class
