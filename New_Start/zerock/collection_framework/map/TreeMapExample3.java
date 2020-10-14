package com.zerock.collection_framework.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import lombok.extern.log4j.Log4j;


@Log4j
public class TreeMapExample3 {
	
	
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();		
		
		treeMap.put(new String("apple"), new Integer(10));
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 10);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		//--------------------------------------------------//
		
		log.info("[c~f값을 검색]");
		
		NavigableMap<String,Integer> rangeMap = 
				treeMap.subMap(
						"c",
						true,
						"f",
						true);
		
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			log.info(entry.getKey() + "-" + entry.getValue() + "페이지");
		}	//enhanced for		
		
	}	//end main

}	//end class
