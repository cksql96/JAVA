package com.zerock.api.clone;

import lombok.extern.log4j.Log4j;


@Log4j
public class MemberExample {
	
	
	public static void main(String[] args) {
		//원복 객체 생성
		Member original = 
				new Member (
						"blue",
						"홍길동",
						"12345",
						25,
						true);
		
		//복제 객체 얻기.
		Member cloned = original.getMember();
		//복제 객체의 패스워드 변경
		String a = "asdf";
		String b = "qwer";
		cloned.password = a+b;
		
		log.info("[복제 객체의 필드값]");
		log.info("id : " + Integer.toHexString(cloned.id.hashCode()));
		log.info("name : " + cloned.name);
		log.info("password : " + Integer.toHexString(cloned.password.hashCode()));
		log.info("age : " + cloned.age);
		log.info("adult : " + cloned.adult);
		
		log.info("-------------------------------------------");
		System.out.println();
		
		log.info("[원본 객체의 필드값]");
		log.info("id : " + Integer.toHexString(original.id.hashCode()));
		log.info("name : " + original.name);
		log.info("password : " + Integer.toHexString(original.password.hashCode()));
		log.info("age : " + original.age);
		log.info("adult : " + original.adult);
		
	}	//end main

}	//end class
