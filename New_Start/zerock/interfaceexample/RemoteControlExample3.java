package com.zerock.interfaceexample;

public class RemoteControlExample3 {
	
	
	public static void main(String[] args) {
		
	//SmartTelevision -> class
	//RemoteControl과 Searchable을 상속받음		
	
	//interface의 자식구현 객체 생성
	SmartTelevision tv = new SmartTelevision();
	
	//다형성 1 : 부모타입의 변수에 자식타입의 구현 객체 대입가능
	
	//RemoteControl 과 Searchable은 인터페이스
	
	// - RemoteControl 부모에 대입
	RemoteControl rc = tv;
	rc.setMute(true);
	
	// - Searchable 부모에 대입
	Searchable searchable = tv;
	searchable.search("http://www.naver.com");
	
	}	//end main

}	//end class
