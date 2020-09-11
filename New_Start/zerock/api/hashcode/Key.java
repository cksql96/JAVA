package com.zerock.api.hashcode;

import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class Key {
	
	public int number;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}	//inner if
		}	//outer if
		return false;
	}	//equals
	
	
	//원래 역할 : 각 객체를 구분해주는 정수값(해쉬코드)를 반환
	//재정의 목적 : 키의 번호를 해쉬코드로 사용(논리적인 해쉬코드)
	@Override
	public int hashCode() {
		return number;
	}
	
}	//end class
