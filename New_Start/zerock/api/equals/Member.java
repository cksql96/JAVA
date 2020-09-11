package com.zerock.api.equals;

import lombok.AllArgsConstructor;

@AllArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class Member {
	
	public String id;
	
	//Object::equals() 메소드 재정의
	@Override
	public boolean equals(Object obj) {
		//매개변수의 뜻. Object obj = 들어온값.
		//예를들어
		//Object obj = (Member타입의) obj1
		//자동 형변환으로 들어간다.
		if(obj instanceof Member) {
			//만약, 들어온 자동형변환된 obj가
			//Member와 주소가 같다면
			Member member = (Member) obj;
			//Object 클래스였던 객체를, 
			//멤버클래스로, 강제형변환 시켜준다.
			if(id.equals(member.id)) {
				//맴버클래스의 id가, 
				//강제형변환된 member id가 같냐?
				//(Object obj의 값)
				return true;
			}	//inner if
		}	//outer if
		return false;
	}	//equals

}	//end class
