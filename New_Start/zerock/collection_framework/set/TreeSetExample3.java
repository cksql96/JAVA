package com.zerock.collection_framework.set;

import java.util.NavigableSet;
import java.util.TreeSet;

import lombok.extern.log4j.Log4j;


@Log4j
public class TreeSetExample3 {
	
	
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		treeSet.add("c");
		treeSet.add("f");
		//---------------------------------------------------//
		
		log.info(treeSet + "\n");
		
		log.info("[c~f 사이의 단어 검색]");
		
		NavigableSet<String> rangeSet = 
				treeSet.subSet(
						"c",				//c부터~
						true,			//c는 포함 시킬꺼냐
						"f",					//f까지!
						true				//f는 포함 시킬꺼냐
						);		
		
		for(String word : rangeSet) {
			log.info(word);
		}	//enhanced for
		
		//--------------------------------------------------------------//
		System.out.println();System.out.println();
		
		log.info("[처음부터 c 사이의 단어 검색]");
		
		NavigableSet<String> rangeSet2 = 
				treeSet.headSet(
						"c", 				//c까지!
						true);				//c는 포함하냐?
		
		for(String word : rangeSet2) {
			log.info(word);
		}	//enhanced for
		
		//--------------------------------------------------------------//
		System.out.println();System.out.println();
		
		log.info("[c부터 마지막 사이의 단어 검색]");
		
		NavigableSet<String> rangeSet3 = 
				treeSet.tailSet(
						"c",				//c부터!
						true);				//c는 포함시킬꺼냐?
		
		for(String word : rangeSet3) {
			log.info(word);
		}	//enhanced for
		
		
		
		
	}	//end main

}	//end class
