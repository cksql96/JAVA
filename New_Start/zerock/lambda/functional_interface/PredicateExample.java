package com.zerock.lambda.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import lombok.extern.log4j.Log4j;

@Log4j
public class PredicateExample {
	
	private static List<Student1> list = Arrays.asList(
			new Student1("홍길동", "남자", 90),
			new Student1("김순희", "여자", 90),
			new Student1("김자바", "남자", 95),
			new Student1("박한나", "여자", 92)			
		);
	
	
	public static double avg( Predicate<Student1> predi) {
		int count = 0;
		int sum = 0;
		
		for(Student1 stu : list) {
			if(predi.test(stu)) {		//predi.test는 boolean타입의 추상메소드.
				count++;
				sum += stu.getScore();
			}	//if			
		}	//enhanced for
		return (double)sum / count;		
	}	//avg
	
	
	//--------------------------MAIN------------------------//
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		
		log.info("남자 평균 점수: " + maleAvg);		
		//----------------------------------------//
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		
		log.info("여자 평균 점수: " + femaleAvg);		
		//----------------------------------------//		
		
	}	//end main	
	
}	//end class
