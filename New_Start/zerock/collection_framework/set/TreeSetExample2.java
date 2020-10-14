package com.zerock.collection_framework.set;

import java.util.NavigableSet;
import java.util.TreeSet;


public class TreeSetExample2 {
	
	
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		scores.add(80);
		scores.add(80);
		scores.add(87);
		
		System.out.println(scores + "\n");
		//---------------------------------------------------//
		
		NavigableSet<Integer> descSet = scores.descendingSet();
		
		System.out.println("####내림차순 정렬후");
		
		for(int score : descSet) {
			System.out.print(score + " ");
		}	//enhanced for
		
		System.out.println("\n");
		//----------------------------------------//
		
		System.out.println("####내림차순 한번 더 정렬후 (오름차순(default)으로 됨)");
		
		NavigableSet<Integer> ascSet = descSet.descendingSet();
		
		for(int score : ascSet) {
			System.out.print(score + " ");
		}	//enhanced for
		
		
		System.out.println(); System.out.println(); System.out.println("--------------------");		

		TreeSet<Integer> a = new TreeSet<>();
		
		a = (TreeSet<Integer>) scores.descendingSet();
		
		System.out.println(a);
		
		System.out.println();
		
		for(int score : a.descendingSet()) {
			System.out.print(score + " ");
		}	//enhanced for
		
		
	}	//end main

}	//end class
