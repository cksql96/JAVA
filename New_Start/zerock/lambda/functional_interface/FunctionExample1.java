package com.zerock.lambda.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import lombok.extern.log4j.Log4j;


@Log4j
//Student
public class FunctionExample1 {
	
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	);	//필드
	
	
	public static void printString(Function<Student,String> function) {		
		for(Student student : list) {
			log.info(function.apply(student) + " ");
		}	//enhanced for
		
		System.out.println();
	}	//printString
	
	
	public static void printInt(ToIntFunction<Student> a) {		
		for(Student student : list) {
			log.info(a.applyAsInt(student) );
		}	//enhanced for
		
		System.out.println();
	}	//printInt
	

	//------------------------------MAIN--------------------------//
	public static void main(String[] args) {
		
		log.info("[학생 이름]");
		FunctionExample1.printString( t -> t.getName() );
		//--------------------------------------------------------//
		
		log.info("[영어 점수]");
		FunctionExample1.printInt( t -> t.getEnglishScore() );
		//--------------------------------------------------------//
		
		log.info("[수학 점수]");
		FunctionExample1.printInt( t -> t.getMathScore() );
		//--------------------------------------------------------//		
		
	}	//end main

}	//end class
