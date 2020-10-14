package com.zerock.comparable_comparator;

import java.util.TreeSet;

import lombok.extern.log4j.Log4j;


@Log4j
public class ComparatorExample {
	
	
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		
		treeSet.add(new Fruit("포도", 3000));
		log.info("포도3000 넣음\n");
		
		treeSet.add(new Fruit("수박", 10000));
		log.info("수박10000 넣음\n");
		
		treeSet.add(new Fruit("딸기", 6000));
		log.info("딸기6000 넣음\n");
		//----------------------------------------------------//
		
//		Iterator<Fruit> iterator = treeSet.iterator();
//		
//		while(iterator.hasNext()) {
//			Fruit fruit = iterator.next();
//			
//			log.info(fruit.name + " : " + fruit.price);
//		}	//while		
		//----------------------------------------------------//
		
		log.info("\n");
		
		for(Fruit a : treeSet) {
			log.info(a.name + " : " + a.price);
		}	//enhanced for		
		
		
	}	//end main

}	//end class
