package com.zerock.api.tostring;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SmartPhone {
	
	private String company;
	private String os;
	
	
	//Object::toString() 메소드 재정의
	//객체의 레퍼런스 문자열 대신, 유의미한 문자열로 재생성
	//하기 위해 재정의함
	@Override
	public String toString() {
		//원래 있떤것,,,
		//return super.toString();
		System.out.println("SmartPhone.toString() invoked.");
		return company + ", " + os;
	}	//toString

}	//end class
