package ch05;

public class Person {
	
	int age;						//나이를 저장하는 instance field.	객체생성없이 존재할 수 없다.
	String name;					//이름을 저장하는 instance field.	객체생성없이 존재할 수 없다.
	
	static String nation;			//국가를 저장하는 static field.		객체를 생성하든 말든 있다.
		
	static {
		nation = "KOREA";	
	}	// static initializer		//static이 붙어있는 정적 필드를 "초기화" 해주는데 필요함
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}	//constructor(생성자)			//instance field를 초기화 해주는데 필요.

}	//end class
