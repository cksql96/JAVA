package com.zerock.api.string;



//	SELECT 
//		employee_id, 
//		first_name, 
//		last_name, 
//		email, 
//		phone_number, 
//		hire_date
//	FROM employees
//	WHERE employee_id BETWEEN ? AND ?;


public class StringBufferExample {
	
	
	public static void main(String[] args) {
				
		StringBuffer ss = new StringBuffer();
		
		ss.append("asdf").append("ㅁㄴㅇㄹ");
		int a = ss.length();
		
		System.out.println("문자: " + ss);
		System.out.println("길이: " + a);
		System.out.println();
		
		
		//Method Chaining을 통한 SQL문자열 생성
		String sql = 
				new StringBuffer().
					append("SELECT ").
					append("	employee_id, ").
					append("	first_name, ").
					append("	last_name, ").
					append("	email, ").
					append("	phone_number, ").
					append("	hire_date ").
					append("FROM ").
					append("	employees ").
					append("WHERE ").
					append("	employee_id BETWEEN ? AND ? ").
					toString();
		
		System.out.println(sql);
		
	}	//end main

}	//end class
