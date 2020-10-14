package com.zerock.collection_framework.map;

import java.util.Map;
import java.util.TreeMap;

import lombok.extern.log4j.Log4j;


@Log4j
public class TreeMapExample1 {
	
	
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(new Integer(87), new String("홍길동"));
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");
		//-------------------------------------------------//
		log.info(scores);
		
		Map.Entry<Integer, String> entry = null;
		//-----------------------------------------//
		
		entry = scores.firstEntry();
		
		log.info("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());
		//-----------------------------------------//
		
		entry = scores.lastEntry();
		
		log.info("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		//-----------------------------------------//
		
		entry = scores.lowerEntry(95);
		
		log.info("95점 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		//-----------------------------------------//
		
		entry = scores.higherEntry(95);
		
		log.info("95점 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		//-----------------------------------------//
		
		entry = scores.floorEntry(95);
		
		log.info("95점 또는 바로 아래 점수 " + entry.getKey() + "-" + entry.getValue());
		//-----------------------------------------//
		
		entry = scores.ceilingEntry(85);
		
		log.info("85점 또는 바로 위의 점수" + entry.getKey() + "-" + entry.getValue() + "\n");
		//-----------------------------------------//
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			
			log.info(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
		}
		
	}	//end main

}	//end class
