package com.zerock.multi_thread.synchronizedSuccess;

//전자계산기를 사용할 worker thread#2
public class User1 extends Thread{
	
	private Calculator calc;
	
	//공유되는 전자계산기를 생성자 매개변수로 받음(왜? 공유하기위해)
	public void setCalculator(Calculator calculator) {
		this.setName("User1");		//스레드 이름 설정
		
		this.calc = calculator;
	}	//constructor
	
	
	@Override
	public void run() {					//실행 메소드
		this.calc.setMemory(100);		//전자계산기 필드에 100 저장
	}	//run

}	//end class
