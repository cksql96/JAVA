package com.zerock.api.objects;

import java.util.Objects;

import lombok.extern.log4j.Log4j;


@Log4j
public class ToStringExample {
	
	
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		log.info(Objects.toString(str1));
		log.info(Objects.toString(str2));
		log.info(Objects.toString(str2, "이름이 없습니다."));
		
		//값이 null인 경우, nullDefault 실행, null이 아닌경우, 그 값을 찍어낸다.
		log.info(Objects.toString(str1, "이름이 있습니다."));
		
		
//		public static String toString(Object o, String nullDefault) {
//	        return (o != null) ? o.toString() : nullDefault;
//	    }
		
	}	//end main

}	//end class
