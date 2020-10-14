package com.zerock.lambda.functional_interface;

import java.util.function.Function;

import lombok.extern.log4j.Log4j;

@Log4j
public class AndThenComposeExample {
	
	
	public static void main(String[] args) {
		Function<AndThenMember, AndThenAddress> functionA;
		Function<AndThenAddress, String> functionB;
		//--------------------------------------------------------------//
		
		Function<AndThenMember, String> functionAB;
		//--------------------------------------------------------------//
		
		String cityyy = null;
		//--------------------------------------------------------------//
		
		functionA = m -> m.getAddress();	//람다식		A가 추구하는것은, Address를 구하기.
		functionB = a -> a.getCity();		//람다식		B가 추구하는것은, City를 구하기.
		//--------------------------------------------------------------//
		
		//두 함수적 인터페이스의 람다식으로 andThen기반으로 파이프라인 구성.
		//function 인터페이스는 리턴값이 존재함.
		functionAB = functionA.andThen(functionB);
		
		cityyy = functionAB.apply(
				new AndThenMember(
						"홍길동",
						"hong",
						new AndThenAddress("한국", "서울")
						)
				);
		
		log.info("거주 도시: " + cityyy);
		//--------------------------------------------------------------//
		
		//두 함수적 인터페이스의 람다식으로 compose기반으로 파이프라인 구성.
		functionAB = functionB.compose(functionA);
		
		cityyy = functionAB.apply(
				new AndThenMember(
						"홍길동",
						"hong",
						new AndThenAddress("한국", "서울")
						)
				);
		
		log.info("거주 도시: " + cityyy);
		
		
	}	//end main

}	//end class
