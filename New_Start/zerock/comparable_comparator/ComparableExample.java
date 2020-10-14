package com.zerock.comparable_comparator;

import java.util.TreeSet;

import lombok.extern.log4j.Log4j;


@Log4j
public class ComparableExample {
	
	
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		log.info("TreeSet만듬\n");
		
		//Set을 기반으로 한 TreeSet이고, 현재 Person에서 비교 대상이 age이므로,
		//중복값은 못들어가므로, age의 값이 같으면 중복이라 안들어가진다.
		treeSet.add(new Person("홍길동", 45));
		log.info("홍길동45 넣음\n");
		
		treeSet.add(new Person("김자바", 25));
		log.info("김자바25 넣음\n");
		
		treeSet.add(new Person("박지원", 31));
		log.info("박지원31 넣음\n");
		
		treeSet.add(new Person("은지원", 31));
		log.info("은지원31 넣음\n");
		
		treeSet.add(new Person("은지원", 33));
		log.info("은지원33 넣음\n");
		
		treeSet.add(new Person("은지원", 35));
		log.info("은지원35 넣음\n");
		//------------------------------------------------------//
		
//		System.out.println();
//		
//		Iterator<Person> iterator = treeSet.iterator();
//		
//		while(iterator.hasNext()) {
//			Person person = iterator.next();
//			
//			log.info(person.name + " : " + person.age);
//		}	//while
		//------------------------------------------------------//
		
		log.info("\n");
		
		for(Person p : treeSet) {
			log.info(p.name + " : " + p.age);
		}
		
		
	}	//end main

}	//end class
