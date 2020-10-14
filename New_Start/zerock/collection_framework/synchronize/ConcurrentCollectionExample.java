package com.zerock.collection_framework.synchronize;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


public class ConcurrentCollectionExample {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//--1. ConcurrentHashMap 객체 생성
		Map<String, Integer> conMap = new ConcurrentHashMap<>();
		
		//--2. ConcurrentLinkedQueue 객체 생성
		Queue<Integer> conQ = new ConcurrentLinkedQueue<>();
				
		
	}	//end main

}	//end class
