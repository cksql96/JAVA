package com.zerock.TTT;

import java.util.Arrays;

class PracticeHackerRank3 {

	public static void main(String[] args) {
		
		String s = "11:01:00PM";
		
		String hourMinSec = s.substring(0,8);
		
		System.out.println("hourMinSec: " + hourMinSec);
		
		String minSec = hourMinSec.substring(2);
		
		System.out.println("minSec: " + minSec);
		
		String[] getHourArr = hourMinSec.split(":");
		
		System.out.println("getHourArr: " + Arrays.toString(getHourArr));
		
		
		int hour = Integer.parseInt(getHourArr[0]);
		
		System.out.println("hour: " + hour);
		
		
		if(s.charAt(8) == 'P' && hour != 12) {
			System.out.println("1번째 if문");
			hour += 12;			
			System.out.println("result: " + hour + minSec);
			
		} else if(s.charAt(8) == 'P' && hour == 12) {
			System.out.println("2번째 if문");
			System.out.println("result: " + hour + minSec);
			
		} else if(s.charAt(8) == 'A' && hour == 12) {
			System.out.println("3번째 if문");
			
			hour -= 12;			
			String test = Integer.toString(hour);
			test = "" + "0" + test;
			
			System.out.println("result: " + test + minSec);
			
		} else if(hour < 10 && s.charAt(8) == 'A' && hour != 12)  {
			System.out.println("4번째 if문");
			
			String test = Integer.toString(hour);
			test = "" + "0" + test;
			
			System.out.println("result: " + test + minSec);
			
		} else {
			System.out.println("else문");
			System.out.println("result: " + hour + minSec);
			
		}	//else	
		
		

	}	//end main

}	//end class
