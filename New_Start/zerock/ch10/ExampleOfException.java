package ch10;

public class ExampleOfException {
	
	
	public static void main(String[] args) {
		
		System.out.println("메인 메소드 시작합니다.\n");
		
		//---------------------------------------------------//
		//NullPointerException
		String a = null;
		System.out.println(a.toString());
		
		//---------------------------------------------------//
		//ArrayIndexOutOfBoundsException1
		int[] b = new int[3];
		
		for(int i = 0; i < b.length; i++) {
			b[i] = 0;
		}	//end for
		
		System.out.println(b[3]);		//array의 크기를 3으로 설정하면, 0 1 2 가 있는데, 
										//3은 크기를 벗어난다. 그래서 예외처리.
				
		//---------------------------------------------------//
		//NumberFormatExceptionExample
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
		
		//---------------------------------------------------//
		
		
		
		
		
		System.out.println("메인 메소드 끝납니다.\n");	
		
	}	//end main

}	//end class
