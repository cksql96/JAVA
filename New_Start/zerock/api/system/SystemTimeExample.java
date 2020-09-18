package com.zerock.api.system;

import lombok.extern.log4j.Log4j;

@Log4j
public class SystemTimeExample {
	
	
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		long start2 = System.currentTimeMillis();		
			//--------------------------------------------//
			double sum = 0;
			for(double i = 1; i <= 1000000; i++) {
				sum += i;
			}	//for
			//--------------------------------------------//		
		long end = System.nanoTime();
		long end2 = System.currentTimeMillis();
		
		
		log.info("1~1,000,000의 합 : " + sum);
		log.info("을 구하는데, " + (end - start) + "나노초가 소요되었습니다.");
		log.info((end-start) / 1000000000.0 + "초");
		log.info((end-start) / Math.pow(10, 9) + "초");
		log.info("을 구하는데, " + (end2 - start2) + "밀리초가 소요되었습니다.");
		log.info((end2 - start2) / 1000.0 + "초");
		
	}	//end main

}	//end class
