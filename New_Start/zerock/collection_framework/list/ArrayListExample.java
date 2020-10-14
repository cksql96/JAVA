package com.zerock.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j;


@Log4j
public class ArrayListExample {
	
	
	public static void main(String[] args) {
		//List구현하는 ArrayList 객체를 생성
		//Lvalue: 인터페이스 변수
		//Rvalue: 실제 List를 구현한 구현객체
		List<String> list = new ArrayList<>();		//String이지만, 생략 가능.
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size = list.size();
		log.info("총 객체수: " + size + "\n");	
				
		log.info("2번 인덱스: " + list.get(2) + "\n");		//2번 인덱스에 뭐가 있냐?
		
		log.info(list.toString());
		
		log.info(list);
		
		//----------------------------------------------------//
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			log.info(i + ":" + str);
		}	//for
		
		log.info("========================\n");	
		int count = 0;
		for(String str : list) {			//for (Scalar 값 : Vector 값)			
			log.info( (count++) + ":" + str);
		}	//enhanced for
		
		log.info("========================\n");		
		//-------------------------------//
		
		log.info("원래 있던것: " + list.toString());
		log.info("========================\n");
		
		list.remove(2);		//2번인덱스 삭제
		log.info("2번 인덱스 지움: " + list.toString());
		log.info("========================\n");
		
		list.remove(2);		//2번인덱스 삭제
		log.info("2번 인덱스 지움: " + list.toString());
		log.info("========================\n");
		
		list.remove("iBATIS");
		log.info("2번 인덱스 지움: " + list.toString());
		log.info("========================\n");		
		
		//------------------------------//		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			log.info(i + ":" + str);
		}	//for		
		
		log.info("========================\n");
		count = 0;
		for(String str : list) {			//for (Scalar 값 : Vector 값)			
			log.info( (count++) + ":" + str);
		}	//enhanced for
			
	}	//end main

}	//end class
