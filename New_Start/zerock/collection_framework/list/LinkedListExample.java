package com.zerock.collection_framework.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.extern.log4j.Log4j;


@Log4j
public class LinkedListExample {
	
	
	public static void main(String[] args) {
		//ArrayList 컬렉션과 LinkedList 컬렉션의 성능 비교
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		//성능측정을 위한 지역 변수 선언
		long startTime = 0;
		long endTime = 0;		
		//-------------------------------------------------------------------//
		
		//*********************************
		startTime = System.nanoTime();	//*
		//*********************************
		
		for(int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));
		}	//for		
		
		//*********************************
		endTime = System.nanoTime();	//*
		//*********************************
		
		log.info( "ArrayList 걸린시간: \t" + (endTime-startTime) + " ns\n");		
		//-------------------------------------------------------------------//
		
		//*********************************
		startTime = System.nanoTime();	//*
		//*********************************
		
		for(int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));
		}	//for
		
		//*********************************
		endTime = System.nanoTime();	//*
		//*********************************
		
		log.info( "LinkedList 걸린시간: \t" + (endTime-startTime) + " ns");
		
	}	//end main

}	//end class
