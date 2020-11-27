package com.zerock.TTT;

import java.util.Arrays;
import java.util.List;

class PracticeHackerRank2 {

	public static void main(String[] args) {
		
		List<Integer> candles = Arrays.asList(44,53,31,27,77,60,66,77,26,36);
		
		int max = 0;
		int count = 0;
		for(int i = 0; i < candles.size(); i ++) {
			
			
			if(candles.get(i) > max) {
				max = candles.get(i);
			}	//if
						
		}	//for
		
		for(int i : candles) {
			
			if(max == i) {
				count++;
			}	//if
			
		}	//enhanced for

		
		
		System.out.println(max);
		System.out.println(count);

	}	//end main

}	//end class
