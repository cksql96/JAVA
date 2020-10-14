package com.zerock.collection_framework.map;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Student {
	public int sno;
	public String name;
	
	
	//1차 중복여부
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}	//hashCode
	
	//2차중복여부
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			
			return(sno ==student.sno) && (name.equals(student.name));			
		} else {
			return false;
		}	//if-else
		
	}	//equals

}	//end class
