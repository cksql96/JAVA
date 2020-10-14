package com.zerock.lambda.arguments;

import lombok.extern.log4j.Log4j;


@Log4j
public class MyFunctionalInterfaceExample {
	
	
	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		fi = (int x) -> {
			int result = x * 5;
			
			log.info(result);
		};	//Lambda Expression
		
		fi.method(2);			//2를 전달인자로 준다.
		log.info(fi + "\n");	//lambda1번 호출. 1번째로 쓴 람다이므로.
		//----------------------------------------------------------------//
		
		fi = (x) -> { log.info(x * 5); };	//Lambda Expression
		
		fi.method(2);
		log.info(fi + "\n");
		//----------------------------------------------------------------//
		
		fi = x -> log.info(x * 5);	//Lambda Expression
		
		fi.method(2);
		log.info(fi);
				
	}	//end main

}	//end class
