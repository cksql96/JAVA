package com.zerock.api.objects;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
public class HashCodeExample {
	
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "김길댕");
		
		log.info("재 정의된 hashCode");
		log.info(s1.hashCode());
		System.out.println();
		log.info("기존의 hashCode");
		log.info(Objects.hashCode(s2));
		
	}	//end main
	
	@AllArgsConstructor
	static class Student {
		int sno;
		String name;
		
		
		//비지니스 로직에 맞는 객체의 식별자를 반환하도록 함.
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}	//hashCode
		
	}	//end inner class	

}	//end class
