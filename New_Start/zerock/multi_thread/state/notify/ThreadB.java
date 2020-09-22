package com.zerock.multi_thread.state.notify;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreadB extends Thread{
	
	private WorkObject work;		//공유객체의 참조(주소) 저장필드
	//public int a;
		
	//public ThreadA(WorkObject workObject) {
	//	this.work = workObject;
	//}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			
			//공유객체에 있는, 자신의 메소드 호출
			work.methodB();
		}	//for
		
	}	//run

}	//end class