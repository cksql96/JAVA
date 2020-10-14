package com.zerock.lambda;

import lombok.extern.log4j.Log4j;


@Log4j
public class MyFunctionalInterfaceExample {
	
	
	public static void main(String[] args) {
		
		//우리가 선언한 인터페이스의 추상메소드를 구현하는 방법들...3가지
		//1. 구현클래스를 만들어 오버라이딩 하는기법.	(여러곳에서 사용할때)
		//	- public class TT implements MyFunctionalInterface{ @Override ... }
		//2. 익명 구현 객체를 사용.	(잠시 사용할때)
		//	- MyfunctionalInterface fi = new MyfunctionalInterface() { @Override ... };
		//3. 람다식의 구현(Lambda Expression)	-> 코딩을 간단하게 만들기 위해 나옴
		//	- 아래 사용한 모든것들... (잠시 사용하고, 실행문장이 길지 않고 복잡하지 않을경우)		
		
		
		//우리가 만든 함수적 인터페이스.
		//이것이 지금 우리가 구현할 람다식의 타겟타입이 됨.		
		MyFunctionalInterface b = () -> { log.info("aa by b"); };
		b.method();
		log.info(b + "\n");
		//-----------------------------------------------------------------------//
		
		MyFunctionalInterface fi;
		
		//타겟타입을 구현하는 첫번째 람다식의 구현
		fi = () -> {
			String str = "1st Lambda Expression method called by fi";
			
			log.info(str);
		};	//Lambda Expression		
		
		//익명 구현 객체가 람다식에 의해 자동으로 만들어 졌으므로,
		//인터페이스에 선언되어있는 추상메소드를 호출하여 사용 가능!
		fi.method();
		log.info(fi + "\n");
		//-----------------------------------------------------------------------//
		
		fi = () -> {
			log.info("2nd Lambda Expression method called by fi");
		};	//Lambda Expression
		
		fi.method();
		log.info(fi + "\n");
		//-----------------------------------------------------------------------//

		fi = () -> log.info("3rd Lambda Expression method called by fi");	//Lambda Expression
		
		fi.method();
		log.info(fi + "\n");
		//-----------------------------------------------------------------------//
		
		b = () -> {
			int a = 4;
			log.info(a + "th Lambda Expression method called by b");
		};	//Lambda Expression
		
		b.method();
		log.info(b + "\n");
		
		
	}	//end main

}	//end class
