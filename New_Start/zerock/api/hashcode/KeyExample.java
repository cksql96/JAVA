package com.zerock.api.hashcode;

import java.util.HashMap;

import lombok.extern.log4j.Log4j;

@Log4j
public class KeyExample {
	
	
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는
		//HashMap 객체 생성
		
		//[key1:value1,key2:value2 ...]
		HashMap hashMap = 
				new HashMap();
		
		//---------------------------//
		
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		hashMap.put(new Key(2), "바보");
		log.info(hashMap);
		
		//------------------------------//
		String value = (String) hashMap.get(new Key(1));
		log.info(value);
		
		//-------------------------------//
		
		Object obj = new Object();
		log.info(obj);
		log.info(obj.hashCode());
		
	}	//end main

}	//end class
