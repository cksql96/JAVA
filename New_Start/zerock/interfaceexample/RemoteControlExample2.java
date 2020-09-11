package com.zerock.interfaceexample;

import lombok.extern.log4j.Log4j;


@Log4j
public class RemoteControlExample2 {
	
	
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			//필드 선언 가능!
		    String name;
		    int age;
		    
		    //생성자는?? 안된다!! 클래스명을 몰라잉!!
		    	//하지만, 자바 컴파일러가 
		    	//default constructor를 
		    	// 자바 컴파일러가 만들어 넣는다.
		    
		    //static initializer는??? 안된다!!
		    
		    
		    //초기화 블록은? 된다!!
		    {
		    	log.info("초기화블록이다");
		    }	//사용자 정의 블록, User-defined block
		    
		    {
		    	log.info("초기화블록2이다");
		    }
		    
		    
		    //인스턴스메소드를 만들어
		    //아래에 오버라이드한 메소드에 사용은 가능하지만
		    //밖으로 꺼내서 쓰지 못한다.
		    public void qwer(int age) {
		    	log.info("인스턴스 메소드다");
		    	this.age = age;
		    	log.info(age);
		    }
		    		    
			@Override
			public void turnOn() {
				log.info("RemoteControl::turnOn() invoked.");
				log.info("이름이다 : " + name);
				log.info("나이다 : " + age);
				qwer(3);
				log.info(this);
			}	//turnOn

			@Override
			public void turnOff() {
				log.info("RemoteControl::turnOff() invoked.");
			}	//turnOff

			@Override
			public void setVolume(int volume) {
				log.info("RemoteControl::setVolume() invoked.");
			}	//setVolume
									
		};		//익명 구현 객체 생성 코딩 기법

		log.info(rc);
		rc.turnOn();
		System.out.println();
		rc.turnOff();
		System.out.println();
		rc.setVolume(4);
		System.out.println();
		rc.setMute(true);
		

		
		//이것이 익명구현객체이다...
		//---------------------//
		//또 다른것들은, 
		//1. 익명자식객체	- 익명구현객체 코딩기법과 비슷
		//
		//2. 익명함수 		by Lambda expression
		
	}	//end main

}	//end class
