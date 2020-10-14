package com.zerock.collection_framework.set;

import java.util.TreeSet;

import lombok.extern.log4j.Log4j;


@Log4j
public class TreeSetExample1 {
	
	
	public static void main(String[] args) {
		//제네릭 특성상, 참조타입인 Integer가 들어간다.
		TreeSet<Integer> scores = new TreeSet<>();		

		//add values by using Auto-Boxing 
//		scores.add(new Integer(87));
//		scores.add(new Integer(98));
//		scores.add(new Integer(75));
//		scores.add(new Integer(95));
//		scores.add(new Integer(80));
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		scores.add(80);
		scores.add(95);
		
		System.out.print("\t\t\t\t\t\t\t  ");
		for(int sc : scores.descendingSet()) {
			if(sc == scores.first()) {
				System.out.print(sc+ "]");
			}else if(sc == scores.last()) {
				System.out.print("[" + sc + ", ");
			}else {
				System.out.print(sc + ", ");
			}			
		}	//for

		System.out.println();
		
		log.info(scores + "\n");
		
//		Integer score = null;
		int score = 0;
		
		score = scores.first();		//Auto-Unboxing		-int 를 integer로 unboxing.
		log.info("가장 낮은 점수: " + score);		
		//---------------------------------------------//
		
		score = scores.last();
		log.info("가장 높은 점수: " + score + "\n");		
		//---------------------------------------------//
		
		score = scores.lower(95);
		log.info("95바로아래 점수: " + score);		
		//---------------------------------------------//
		
		score = scores.higher(new Integer(95));
		log.info("95바로위의 점수: " + score + "\n");		
		//---------------------------------------------//
		
		score = scores.floor(95);
		log.info("95이거나 바로 아래 점수: " + score);		
		//---------------------------------------------//
		
		score = scores.ceiling(85);
		log.info("85이거나 바로 위의 점수: " + score + "\n");		
		//---------------------------------------------//
		
		log.info(scores + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			
			log.info(score + "를 뽑아낸다(없앤다잉) (이후 남은 객체수: " + scores.size() + ")");
			log.info(scores + "\n");
		}	//while		
		
		
	}	//end main

}	//end class
