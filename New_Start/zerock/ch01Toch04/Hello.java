package ch01Toch04;

public class Hello {
	
	
	public static void main(String[] args) {
		System.out.println("Hello, welcome to the java");
		System.out.println();
		
		System.out.println("Standard Output");					//sysout
		System.err.println("Standard Error");					//syserr
		
		System.out.println();
		System.out.println("Hello.main()");						//systrace
		//호출되는 메소드의 호출 
		
		//어떤 언어로 프로그램을 만들든, 이 프로그램을 수행시키는 순간,
		//운영체제는 해당 프로세스(실행중인 프로그램)에 3개의 자원을 할당
		//1) 표준입력 (Standard Input)		->System.in.~~
		//2) 표준출력 (Standard Output)	->System.out.~~
		//3) 표준에러 (Standard Error)		->System.err.~~
		
	}	//main

}	//end class
