package com.zerock.collection_framework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.extern.log4j.Log4j;


@Log4j
public class HashMapExample1 {
	
	
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장		->Map.Entry 객체로 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 85);
		
//		배열이나 Iterable을 구현한 객체만 가능
//		for(Map.Entry<String, Integer> e: map) {
//			
//		}		
		
		log.info("map자체를 찍으면 ->" + map);
		//컬렉션 크기 획득 및 출력
		log.info("총 entry 수 : " + map.size());
		
		//객체 검색
		log.info("\t홍길동 : " + map.get("홍길동") + "\n");
		
		//모든 객체 traverse by using iterator
		Set<String> keySet = map.keySet();		//키만 추출하여 Set에 넣어준다.
		
//		//set 컬렉션에서 Iterator를 추출하여, 모든요소를 traverse한다.
//		Iterator<String> keyIterator = keySet.iterator();
//		
//		while(keyIterator.hasNext()) {
//			String key = keyIterator.next();	//Key 획득
//			
//			Integer value = map.get(key);		//Key로 Value 획득
//			
//			log.info("\t" + key + " : " + value);
//		}	//while
		
		for(String key : keySet) {
			log.info(key + " : " + map.get(key));
		}	//enhanced for
		
		log.info("\n");
		
		//객체삭제
		map.remove("홍길동");
		
		log.info("총 Entry 수: " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
//		//set 컬렉션에서 Iterator획득
//		Iterator< Map.Entry<String, Integer> > entryIterator = entrySet.iterator();
//		
//		//Iterator를 통해 모든 요소 traverse
//		while(entryIterator.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIterator.next();
//			
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			
//			log.info("\t" + key + " : " + value);
//		}	//while
		
		for(Map.Entry<String, Integer> key : entrySet) {
			log.info(key);
			log.info(key.getKey() + " : " + key.getValue());
		}	//enhanced for
		
		log.info("\n");		
		
		//객체 전체 삭제
		map.clear();
		
		log.info("총 Entry수 : " + map.size());
		
	}	//end main

}	//end class
