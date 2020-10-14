package com.zerock.collection_framework.set;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.log4j.Log4j;


@Log4j
public class HashSetExample3 {
	
	
	public static void main(String[] args) {
		//Set 컬렉션 객체 생성
		Set<Integer> set = new HashSet<>();
		
		//Member 객체를 set컬렉션에 넣음.
		set.add(1);		
		set.add(2);	
		set.add(3);	
		set.add(4);	
		set.add(5);	
		set.add(5);	
		set.add(5);	
		set.add(8);	
		set.add(9);	
		
		log.info(set);
		
	}	//end main

}
