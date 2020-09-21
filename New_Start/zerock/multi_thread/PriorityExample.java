package com.zerock.multi_thread;

public class PriorityExample {
	
	//CalcThread
	public static void main(String[] args) {
		
		for(int i = 1; i <=10; i++) {
			
			Thread thread = new CalcThread("thread" +i);
			
			if(i != 10) {	//1~9는 MIN
				//스레드 스케줄링(즉, 우선순위 조정)
				thread.setPriority(Thread.MIN_PRIORITY);	//우선순위를 1로 만든다.(최저)
			} else {	//10은 MAX
				//스레드 스케줄링(즉, 우선순위 조정)
				thread.setPriority(Thread.MAX_PRIORITY);	//우선순위를 10으로 만든다.(최상)
			}	//if-else
			
			thread.start();			//스레드 구동
		}	//for		
		
		//우선순위를 최상위로 놓아도, 실행되는 순서는 무작위성으로, 판단할수 없다.
		
	}	//end main

}	//end class
