package com.zerock.generic.method;

import lombok.extern.log4j.Log4j;


@Log4j
public class CompareMethodExample {
	
	
	public static void main(String[] args) {
		
		//Generic Class Pair<K,V>에서 2개의 객체 생성
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		
		//-----------------------------------------------//
		
		//Generic Method Invocation
		boolean result1 = PairMethod.<Integer,String>compare(p1, p2);		
		
		//-----------------------------------------------//
		//비교결과를 가지고 로직처리
		if(result1) {
			log.info("논리적으로 동등");
		}else {
			log.info("논리적으로 동등하지 않음");
		}	//if-else		
		//-----------------------------------------------//
		//-----------------------------------------------//
		//-----------------------------------------------//
		
		Pair<String, String> p3 = new Pair<>("user1","홍길동");
		Pair<String, String> p4 = new Pair<>("user2", "홍길동");		
		
		boolean result2 = PairMethod.compare(p3,p4);		
		
		log.info("");
		if(result2) {
			log.info("논리적으로 동등");
		}else {
			log.info("논리적으로 동등하지 않음");
		}	//if-else		
		
		
	}	//end main

}	//end class
