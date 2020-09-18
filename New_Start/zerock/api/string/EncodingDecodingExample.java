package com.zerock.api.string;

import java.io.IOException;
import java.util.Arrays;

import lombok.extern.log4j.Log4j;


@Log4j
public class EncodingDecodingExample {
	
	
	public static void main(String[] args) throws IOException {
		
		//UTF-8은, 한글은 3바이트 차지 
		//MS949는, 한글은 2바이트 차지.		
		
		byte[] a = new byte[100];
		
		System.out.println("값넣어라.");		
		//System.in.read()는 char값이 들어가는데, 각각의 값이 a라는 배열안에 들어간다.
		//특수한 이유가 있는듯..? 잘 모름. 그냥 Scanner를 쓰쟈.
		int readByteNo = System.in.read(a);		//이것이 encoding
		
		System.out.println("??");
		
		int b =	System.in.read(); 
		System.out.println("b: " + b);
		
		//***********************************************************************************
		//																					*
		//***********************************************************************************
		//좀더 깔끔하게 배열을 만들기 위해서.
		//-2를 하는 이유는, System.in을 할시, \r \n 을 제거해주는 역할이다.   \r = 13, \n = 10	
		byte[] encoding = Arrays.copyOf(a, readByteNo-2);
		
		log.info("읽어낸 바이트 개수: " + readByteNo);
		log.info("그중 \\r과 \\n을 지운 개수: " + (readByteNo -2));
		log.info(Arrays.toString(encoding));		
		//***********************************************************************************
		//																					*
		//***********************************************************************************		
		String decoding = new String(encoding,"utf-8");	//이것이 decoding
		
		log.info(decoding);
		
	}	//end main

}	//end class
