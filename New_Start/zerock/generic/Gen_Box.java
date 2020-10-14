package com.zerock.generic;

//제네릭 타입: 2가지 (제네릭 클래스, 제네릭 인터페이스)
//클래스/인터페이스 이름 뒤 <> 기호를 붙이고
//이 <> 사이에, 소위 "타입 파라미터(타입 매개변수)"라는 것을 
//단문자(대문자)로 넣어준다.

public class Gen_Box<T> {		//T는 타입 매개변수 이름(변수명)
								//이 제네릭클래스를 사용할 때, Gen_Box<String>을 하면,
	private T a;				//이 클래스 안에 있는 모든 T에 String을 넣어준다.
	
	
	public void set(T t) {
		this.a = t;
	}	//set
	
	public T get() {
		return a;
	}	//get		
	
//	private Object object;		
//	
//	
//	public void set(Object object) {
//		this.object = object;
//	}	//set
//	
//	public Object get() {
//		return object;
//	}	//get

}	//end class
