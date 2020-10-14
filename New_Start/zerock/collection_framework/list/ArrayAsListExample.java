package com.zerock.collection_framework.list;

import java.util.Arrays;
import java.util.List;

import lombok.extern.log4j.Log4j;


@Log4j
public class ArrayAsListExample {
	
	
	public static void main(String[] args) {
		
		int count = 0;
		
		//List<String>타입의 List컬렉션을 생성할때, 값의 목록을 가지고 있다면,
		//이 값의 목록으로 간단하게 List 걸렉션을 만들수 있다.
		//Arrays.asList(T...)
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		
		for(String name: list1) {
			log.info("list1[" + count++ + "]: " + name);
		}	//enhanced for
		System.out.println();
		//------------------------------------------------//
		
		@SuppressWarnings("unused")
		List<Integer> list3 = Arrays.<Integer>asList(	//정석
				new Integer(1),
				new Integer(2),
				new Integer(3)
				);		//auto boxing의 힘을 빌리지 않으려면, 이렇게 해야된다.		
		
		List<Integer> list2 = Arrays.asList(1,2,3);		
		
		count = 0;
		for(int value : list2) {
			log.info("list2[" + count++ + "]: " + value);			
		}	//enhanced for		
		System.out.println();
		//------------------------------------------------//
		
		log.info("list1을 찍으면? : \t\t\t\t" + list1);
		
		log.info("list1.toString()을 찍으면? : \t\t\t" + list1.toString());
		
		log.info("list1.getClass().getName()을 찍으면? : \t" + list1.getClass().getName());
		
	}	//end main

}	//end class
