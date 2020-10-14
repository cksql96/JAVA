package com.zerock.comparable_comparator;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@AllArgsConstructor
public class Person implements Comparable<Person>{
	public String name;
	public int age;
	

	@Override
	public int compareTo(Person o) {
		// 두 객체의 대소를 비교 할때에는 아래와 같은 규칙으로 비교 결과를 리턴해야함.
		//A : 기준객체, B : 비교객체
		//if A > B , return Positive
		//if A == B, return 0
		//if A < B , return Negative
		log.info("compareTo(Person) invoked");
		
		if(this.age < o.age) {
			return -1;
		} else if(this.age == o.age) {
			return 0;
		} else {
			return 1;
		}	//if-else
	}	//compareTo	

}	//end class
