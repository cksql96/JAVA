package com.zerock.collection_framework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lombok.extern.log4j.Log4j;


@Log4j
public class HashSetExample1 {
	
	
	public static void main(String[] args) {
		//Set 인터페이스를 구현하는 Set Collection생성
		Set<String> set = new HashSet<>();		
		
		//객체(엘리먼트, 요소) 추가(인덱스란 개념이 없음)
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		//set 컬렉션의 크기(즉, 구슬의 개수) 반환
		int size = set.size();
		
		log.info("총 객체수: " + size);		
		
		log.info("log.info(set)을 사용하면 -> " + set + "\n");
		
		//반복자 객체 획득
		//이유 set 컬렉션에 들어가있는 각각의 객체를 사용하고자 할때 필요함(traverse,순회)
		Iterator<String> iterator = set.iterator();
		
		//traverse
		while(iterator.hasNext()) {
			String element = iterator.next();
			log.info("\t" + element);
		}	//while
		
		//객체 삭제(인덱스란 개념이 없으므로, 객체를 전달하여 삭제)
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println();
		log.info("JDBC와 iBATIS를 지우고 난 후 총 객체수: " + set.size());
		
		//향상된 for문을 이용한 traverse(각 구슬 사용)
		for(String element : set) {
			log.info("\t" + element);
		}	//enhanced for
		
		//set컬렉션을 한번에 비워버림
		set.clear();
		
		System.out.println();
		log.info("clear메소를 사용하고 난 후 총 객체수: " + set.size());
		
		if(set.isEmpty()) {
			log.info("비어있음");
		}	//if
		
		
	}	//end main

}	//end class
