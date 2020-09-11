package com.zerock.api.finalize;

import lombok.extern.log4j.Log4j;


public class FinalizeExample {
	
	
	public static void main(String[] args) {
		
		Counter counter = null;
		
		for(int i = 1; i <= 500; i++) {
			System.out.print(". ");
			counter = new Counter(i);
			counter = null;		//객체의 레퍼런스 버림
								//0>가비지로 만듬
			System.gc();		//GC가 발생하도록 요청
		}	//for		
		
	}	//end main

}	//end class
