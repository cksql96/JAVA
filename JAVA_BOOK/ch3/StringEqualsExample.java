package ch3;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strVar1 = "바보";
		String strVar2 = "바보";
		String strVar3 = new String("바보");
		String strVar4 = "밥오";
		
		System.out.println(strVar1 == strVar2);				//같은 객체에서의 문자열 비교	T
		System.out.println(strVar1 == strVar4);				//같은 객체에서의 문자열 비교	F
		System.out.println(strVar1 == strVar3);				//같은 객체에서의 문자열 비교	F
		System.out.println();
		
		System.out.println(strVar1.equals(strVar2));		//문자열만 비교				T
		System.out.println(strVar1.equals(strVar3));		//문자열만 비교				T
		System.out.println(strVar1.equals(strVar4));		//문자열만 비교				F
	}

}
