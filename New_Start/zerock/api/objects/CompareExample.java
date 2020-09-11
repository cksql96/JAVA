package com.zerock.api.objects;

import java.util.Comparator;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
public class CompareExample {
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result = 
				Objects.compare(s1, s2, new StudentComparator());
		log.info(result);
		
		result =
				Objects.compare(s1, s3, new StudentComparator());
		log.info(result);
		
	}	//end main
	
	//Inner class
	@AllArgsConstructor
	static class Student {
		int sno;
	}	// end Inner class
	
	//Inner static class
	static class StudentComparator 
		implements Comparator {
				
		@Override
		public int compare(Object a, Object b) {

			Student s1 = (Student) a;
			Student s2 = (Student) b;
			return Integer.compare(s1.sno, s2.sno);
//			return Integer.compare(a.sno, b.sno);
		}	//compare
		
	}	//end Inner static class 

}	//end class
