package com.zerock.lambda.local_variable;

import lombok.extern.log4j.Log4j;

@Log4j
public class UsingLocalVariable {
	
	
	void method(/* final */int arg) {		//자동으로 넣어준다.		(람다식때문에)	상수화 된다.
		/* final */ int localVar = 40;		//자동으로 넣어준다.		(람다식때문에)	상수화 된다.
		
		
		int localVar2 = 80;					//람다식안에 안들어가므로, final을 안붙이는 일반 변수가 된다.
		localVar2 = 100;
		System.out.println(localVar2);
		
//		arg = 31;			//Closure 문제로 인해, 자바는 람다식에 쓰이는 arg와 localVar를, 
//		localVar = 41;		//컴파일러가 자동으로 final을 붙여, 상수로 만들어, 메소드영역에 상수풀에 집어넣는다.
		
		MyFunctionalInterface fi = () -> {
			log.info("arg: " + arg);
			log.info("localVar: " + localVar + "\n");
		};
		
		fi.method();
		
	}	//method

}	//end class
