package com.zerock.lambda.functional_interface;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor(access=lombok.AccessLevel.PUBLIC)
//FunctionExample1
public class Student {
	
	private String name;
	private int englishScore;
	private int mathScore;	

}	//end class
