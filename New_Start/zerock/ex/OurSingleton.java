package com.zerock.ex;

public class OurSingleton {
	private static OurSingleton os;
	
	
	//메소드 영역에 Class타입의 clazz 객체를 생성해서,
	//넣기 직전에, 단 한번 호출하는 블록
	static {
		os = new OurSingleton();
	}	//static initializer
	
	
	private OurSingleton() {
		;;
	}	//constructor
	
	
	public static OurSingleton getInstance() {
		return os;
	}	//getOurSingleton
	

}	//end class
