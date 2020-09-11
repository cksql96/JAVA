package com.zerock.api.clone;

import lombok.AllArgsConstructor;

@AllArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class Member implements Cloneable{
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member getMember() {
		Member cloned = null;
		
		try {	//shadow Copy 발생
			// Object:: clone() 메소드의 
			//return type은 Object.
			
			//다형성1을 해제위해 강제형변환(자식객체로 환원)
			cloned = (Member) clone();
		} catch( CloneNotSupportedException e) {
			//Object::clone() 메소드 발생시,
			//CloneNotSupportedException 이라는
			//checked exception 발생 시킴.
			e.printStackTrace();
		}	//try - catch
		
		return cloned;
		
	}	//getMember

}	//end class
