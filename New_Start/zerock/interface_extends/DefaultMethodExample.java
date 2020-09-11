package com.zerock.interface_extends;

public class DefaultMethodExample {
	
	
	public static void main(String[] args) {
		
		MyInterface mi1 = new MyClassA();
		
		System.out.println("mi1.method1");
		mi1.method1();
		System.out.println("mi1.method2");
		mi1.method2();
		
		
		System.out.println();
		System.out.println();
		//--------------------------------//
		MyInterface mi2 = new MyClassB();
		
		System.out.println("mi2.method1");
		mi2.method1();
		System.out.println("mi2.method2");
		mi2.method2();
		
	}	//end main

}	//end class
