package TempCh6;

public class Person {

	final String nation = "Korea";		//final 을 준 이유는 그냥 예시. 아니면 태어난곳이 korea여서 바꿀수 없어서 final 준듯.
	final String ssn;					//final 을 준 이유는 주민번호는 바꿀수 없어서.
	String name;						//final 을 안 준 이유는 계명 가능
	
	public Person(String ssn, String name) {				//final 필드 초기값주는 방법 2가지.
		this.ssn = ssn;										//1.필드 선언
		this.name = name;									//2.생성자에서 주는것.
	}
}
