package ch06;

public class Student {
	String name;
	int age;
	
	static String nation = "Korea";			//모든 객체한테 공유가 되는 것이 정적필드. 얘는 객체가 있든 없든 
											//생성되는 필드. 클래스에 소속된 맴버,
											//객체 생성과 무관하게, 실행되기 위해서.
	
	
	//인스턴스 필드의 초기화 ---> 생성자의 역할, 객체에 소속된 맴버.
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		
	}	// constructor -> 만들면 new연산자 사용하여 객체 생성할때, 생성자를 지정해줘야한다.
	
}	//end class
