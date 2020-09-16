package ch05;

public class ArrayReferenceObjectExample {
	
	
	public static void main(String[] args) {
		String[] strArray = new String[3];
		
		strArray[0] = "Java";									//문자열 리터럴
		strArray[1] = "Java";									//문자열 리터럴
		strArray[2] = new String("Java");						//문자열 객체 생성
		//strArray 라는 객체 안에. 1주소 및 2주소가 생성이 되는데, 1주소는 0과 1이 있고,
		//2주소는 new String으로 만든 2에 들어간다.
		//큰 주소인 strArray는 같으나, 그 안에 또다른 주소로 나뉜다.
		//112동은 같으나, 801호, 802호가 있듯이, 같은 동수지만, 호수가 다른거랑 비슷한 원리.
		
		System.out.println(strArray[0] == strArray[1]);			//true
		System.out.println(strArray[0] == strArray[2]);			//false
		
		System.out.println(strArray[0].equals(strArray[2]));	//true
		
	}	//end main

}	//end class
