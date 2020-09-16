package ch01Toch04;

//자동차를 찍어내는 틀
class Car {
	String model;		//필드라고 부른다.
	
}	//end class

public class VariableScopeExample {
	
	//변수의 유효범위 예제
	public static void main(String[] args) {
		
		Car car1 = new Car();	//car 1 이라는 객체 생성.
		
		//개발자가 직접 객체를 파괴하는 방법을 자바언어에서는 제공하지 않음.
		//누가 파괴하느냐? -> Garbage collector가 수행한다.
		car1 = null;		//-> 아무값도 주지 않아 쓰레기로 만든다. -> Garbage collector가 삭제한다.
		//쓸만큼 쓴다음에 car1 = null을 주면 알아서 삭제해준다.
		
		
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
			
			System.out.println("var2는" + var2);
		}	//end if
				
		var1 = 10;
		//var2 = 20;		//오류가 뜬다. 왜냐하면 if block 에서 선언이 되었고, if문이 끝났으므로, 사라짐.
		
		
		for(int i = 0; i < 1; i++) {
			//초기식     //조건식  //증감식
			int var3;
			
			var1 = 10;
			var3 = 30;
			
			System.out.println("var3은" + var3);
		}	//end for;
		
		var1 = 10;
		//var3 = 30;		//18번 줄이랑 같은 이유.
		
		System.out.println("var1은" + var1);
		
		//사용자 정의 블록, User-defined block
		{
			int var4;
			var4 = 10;
			
			System.out.println("var4는" + var4);
		}	//end User-defined block
		
	}	//end main

} //end class
