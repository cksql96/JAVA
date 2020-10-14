package com.zerock.lambda.functional_interface;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Student1 {	
	private String name;
	@Getter private String sex;
	@Getter private int score;

}	//end class
