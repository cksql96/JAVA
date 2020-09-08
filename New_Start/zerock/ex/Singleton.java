package com.zerock.ex;


public class Singleton {
	
	//(2)자기 자신의 클래스 타입의 정적 필드 선언.
	
	private static Singleton a = new Singleton();
	//(3) new를 사용하여, 객체의 주소를 a에 저장
	
	private Singleton() {	//(1)생성자를 감춰버림
		;;
	}
	
	//(4) 싱글톤의 주솔르 반환 정적 메소드를 선언.
	static Singleton getInstance() {
		return Singleton.a;
	}

}
