package com.zerock.collection_framework.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import lombok.extern.log4j.Log4j;


@Log4j
public class TreeMapExample2 {	
	
	
	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<>();
		
		scores.put(new Integer(87), new String("홍길동"));
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");
		
		log.info(scores + "\n");
		//----------------------------------------//
		
		NavigableMap<Integer,String> descMap = scores.descendingMap();
		
		Set<Map.Entry<Integer,String>> descEntrySet = descMap.entrySet();
		
		for(Map.Entry<Integer,String> entry : descEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}	//enhanced for
		
		System.out.println();System.out.println();		
		//-----------------------------------------------------//
		
		NavigableMap<Integer,String> ascMap = descMap.descendingMap();
		
		Set<Map.Entry<Integer, String>> ascEntrySet = ascMap.entrySet();
		
		for(Map.Entry<Integer, String> entry : ascEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}	//enhanced for	
	
		
	}	//end main
	
}	//end class
