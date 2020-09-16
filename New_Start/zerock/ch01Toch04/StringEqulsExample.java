package ch01Toch04;

public class StringEqulsExample {
	
	public static void main(String... args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");		//객체 생성 연산자. new 연산자.
				
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
	}	//end main

}	//end class
