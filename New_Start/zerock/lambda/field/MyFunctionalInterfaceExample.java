package com.zerock.lambda.field;


public class MyFunctionalInterfaceExample {
	
	
	public static void main(String[] args) {
		//Outer클래스 객체 생성
		UsingThis usingThis = new UsingThis();
		
		//만일 Inner 클래스에서 객체를 찍어내려면?
		//가장 바깥쪽 클래스의 객체를 먼저 생성하고,
		//그 객체를 이용하여, 안쪽 클래스의 객체를 생성해야 한다.
		UsingThis.Inner inner = usingThis.new Inner();
		
		//한번더 안에 있는것을 사용할때는 이런식으로.
		UsingThis.Inner.InInner inInner = inner.new InInner();
		
		System.out.print("\"" + inInner.inInnerField + "\"");
		
		inner.aaa();
		
		
	}	//end main

}	//end class
