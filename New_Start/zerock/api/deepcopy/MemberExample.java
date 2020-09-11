package com.zerock.api.deepcopy;

import java.util.Arrays;

import lombok.extern.log4j.Log4j;

@Log4j
public class MemberExample {
	
	
	public static void main(String[] args) {
		//원본객체 생성		
		Member original =
				new Member(
						"홍길동",
						25,
						new int[] {90,95},
						new Car("소나타"));
		
		//복제 객체를 얻은 후에, 참조객체의 값을 변경
		
		//바꿔놓은 clone()을 적용한 getMember로 인해, 
		//deep copy 된 클론 객체 획득
		Member cloned = original.getMember();
		
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		log.info("[복제 객체의 필드값]");
		log.info("name : " + cloned.name);
		log.info("age : " + cloned.age);
		
		System.out.print("\t\t\t\t\t\t\t\t\t    - scores: {");
		
		for(int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))? "" : ", ");
		}	//for
		
		System.out.println("}");
		
		log.info("car : " + cloned.car.model);
		
		log.info("--------------------------");
		
		log.info("[원본 객체의 필드값]");
		log.info("name : " + original.name);
		log.info("age : " + original.age);
		log.info("scores: " + Arrays.toString(original.scores));
		log.info("car : " + original.car.model);
				
	}	//end main

}	//end class
