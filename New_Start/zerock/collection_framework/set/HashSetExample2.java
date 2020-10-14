package com.zerock.collection_framework.set;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.log4j.Log4j;


@Log4j
public class HashSetExample2 {
	
	
	public static void main(String[] args) {
		//Set 컬렉션 객체 생성
		Set<Member> set = new HashSet<Member>();
		
		//Member 객체를 set컬렉션에 넣음.
		set.add(new Member("홍길동", 30));
		log.info("첫번째꺼 완료.\n");		

		set.add(new Member("홍길동", 30));
		log.info("두번째꺼 완료.\n");
		
		set.add(new Member("ㅋㅋㅋ", 30));
		log.info("세번째꺼 완료.\n");
		
		set.add(new Member("홍길동", 31));
		log.info("네번째꺼 완료.\n");		
		
		set.add(new Member("홍길동", 30));
		log.info("다섯번째꺼 완료.\n");
		
		log.info("총 객체수 : " + set.size() + "\n");
		log.info(set);
		
		
	}	//end main

}	//end class
