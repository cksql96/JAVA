package ch01Toch04;

public class SignOperatorExample {
	
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		//-----------------------------------------//
		
		short s = 100;
		//short result3 = -s;		//컴파일 에러. 정수 연산(부호연산자)의 기본타입은 int로 간다.
		//int타입과 int타입보다 작은 크기의 타입은 연산을 할때 int로 바뀐다.
		int result3 = -s;
		System.out.println("result3 = " + result3);
		
		byte a = 1;
		short b = /*(short)*/ a;			//자동형변환
		int c = /*(int)*/b;					//자동 형변환
		
		int d = 1;
		byte e = (byte) d;					//강제형변환
				
	}	//end main

}	//end class
