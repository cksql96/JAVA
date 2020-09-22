package com.zerock.multi_thread.state.notify;

public class WaitNotifyExample {
	
	
	public static void main(String[] args) throws InterruptedException {
				
		/** 쓰레드간, 협업을 위해서는, 아래의 조건을 만족해야된다.
		 * (1) 	Object class 의 wait(), notify(), notifyAll()은
		 * 		반드시 객체락을 얻은 상태에서만 호출 가능하다.
		 * 		반드시 동기화 메소드, 동기화 블록 내부에서만 호출 가능.
		 * 
		 * (2) 	각 스레드가 수행할 메소드(로직)를 반드시, 공유객체의 메소드로 집어넣고,
		 * 		동기화 처리 해야된다.
		 * 
		 * (3) 	공유객체의 각 스레드가 호출할 동기화 메소드 내에, 실제 각 스레드의
		 * 		핵심 로직을 구현 한다.
		 */		
		
		//1.스레드간 공유되는, 공유객체 생성
		WorkObject sharedObject = new WorkObject();
		
		//2.각 스레드 객체 생성 및 공유객체의 참조전달(생성자 매개변수로)
		ThreadA threadA = new ThreadA(sharedObject);			//A, B만 사용해야, 번갈아가면서 사용가능하다.
		ThreadB threadB = new ThreadB(sharedObject);
		ThreadC threadC = new ThreadC(sharedObject);
		ThreadD threadD = new ThreadD(sharedObject);
		
		//3. 두 스레드 구동
		threadA.start();
		threadB.start();
		threadC.start();
		threadD.start();
		
	}	//end main

}	//end class
