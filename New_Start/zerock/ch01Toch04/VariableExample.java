package ch01Toch04;

public class VariableExample {
	int age;		//오류가 안뜨는이유. -> 필드영역에는 컴파일러가 타입에 맞게 자동으로 초기값을 넣어준다.
	{
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		VariableExample a = new VariableExample();
		a.age = 1;
		System.out.println(a.age);
		
		//변수들은 메모리에 저장이 된다.
		//10을 변수 value의 초기값으로 저장
		int value = 10;		//변수 정의. 초기값
		value = 20;			//값
		
		//변수 value값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
					//operand(피연산자) +(operator) operand(피연산자)
					//표현식(expression) - 많은 연산자와 피연산자로 구성된 식!
		//변수 result 갑승ㄹ 릭고 콘솔에 출력
		System.out.println(result);
	}	//main

}	//end class
