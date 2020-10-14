package com.zerock.generic.bounded;

import lombok.extern.log4j.Log4j;

@Log4j
public class BountedTypeParameterExample {
	
	
	public static void main(String[] args) {
		int result1 = Util.<Integer>compare(10, 20);
		log.info(result1);	//t1 이 작으면 -1
		
		int result2 = Util.<Number>compare(4.5, 3);
		log.info(result2);	//t1이 크면 1

//		public static int compare(double d1, double d2) {
//	        if (d1 < d2)
//	            return -1;           // Neither val is NaN, thisVal is smaller
//	        if (d1 > d2)
//	            return 1;            // Neither val is NaN, thisVal is larger
		
		
	}	//end main

}	//end class
