package com.zerock.generic.wildcard;

public class Course<T> {
	private String name;
	private T[] students;
	
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		//일반적으로는, int[] arr = new int[100]이지만,
		//Generic Type을 원소로 가지는 배열을 만들때,
		//바로 new T[] 문법으로는 배열을 만들수가 없다.
		//때문에, 최상위 타입을 가지는 배열을 먼저 만들고,
		//그후, 강제형변환을 통해, Generic Type T[] 배열을 만들어야한다.
		
	}	//constructor
	
	public String getName() {
		return name;
	}	//getName
	
	public T[] getStudents() {
		return students;
	}	//getStudents
	
	public void add(T Stu) {		
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = Stu;
				break;
			}	//if
			
		}	//for
		
	}	//add

}	//end class
