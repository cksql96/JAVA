package com.zerock.api.string;

import lombok.extern.log4j.Log4j;


@Log4j
public class StringBuilderExample {
	
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
												//현재 sb라는 객체안에는 아무글도 없다.
		sb.append("Java ");						//append -> 맨 뒤에다가 붙인다.
		sb.append("Program Study");
		log.info(sb.toString());
		
		//------------------------------------------------//
		sb.insert(4, "뀨");					//삽입시킬 인덱스번호를 찾고 추가한다.
		log.info(sb.toString());
		
		//------------------------------------------------//
		sb.setCharAt(4, 'ㅁ');				//지정된 위치에 한개의 문자로 세팅해라.
		log.info(sb.toString());
		
		//------------------------------------------------//
		sb.replace(6, 13, "Book");		//지정된 구간의 문자를 지우고, 지정한 문자로 바꾼다.
		log.info(sb.toString());						//6번째 인덱스부터 13이전까지의 인덱스 즉 6 7 8 9 10 11 12
														
		//------------------------------------------------//
		sb.delete(4, 5);					//지정된 구간의 문자를 지운다. 4번째부터 5번째 전까지. 즉 4번째.
		log.info(sb.toString());
		
		//------------------------------------------------//
		int length = sb.length();
		log.info("문자열의 길이(문자 개수는): " + length);
		
		//------------------------------------------------//
		//sb자체가 클래스이므로, String에 못들어간다. 그러므로, toString이라는 스트링타입의 메소드를 불러와서,
		//String에 넣어주는 역할을 한다.
		String result = sb.toString();			
		
		log.info("sb           : " + sb);				//가능하다.
		log.info("sb.toString(): " + sb.toString());		
		log.info(result);
				
	}	//end main
	
}	//end class
