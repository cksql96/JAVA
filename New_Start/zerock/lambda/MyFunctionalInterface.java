package com.zerock.lambda;


//함수적 인터페이스 선언시 사용하는 어노테이션-> 있으나 없으나 상관 없으나,
//있으면, 컴파일러가 이 인터페이스가 함수적 인터페이스인지 강하게 체크를 한다.
@FunctionalInterface
//함수적 인터페이스는 추상메소드가 오직 한개만 있는것을 의미.
//상수나, default method, static method는 있든 없든 상관 없다.
public interface MyFunctionalInterface {
	
	public abstract void method();		//추상메소드가 오직 1개 선언.

}	//end interface
