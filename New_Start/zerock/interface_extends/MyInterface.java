package com.zerock.interface_extends;

public interface MyInterface {
	
	public abstract void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}	//method2

}	//end interface
