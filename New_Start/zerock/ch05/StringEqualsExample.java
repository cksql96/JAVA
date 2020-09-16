package ch05;

public class StringEqualsExample {
	
	
	public static void main(String[] args) {
		//힙영역에 생성하고, 값이 같으면, 주소를 공유.
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {			//주소비교
			System.out.println("주소같음");
		} else {
			System.out.println("주소다름");
		}	//end if-else
		
		if(strVar1.equals(strVar2)) {		//값을 비교
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}	//end if
		
		//-----------------------------------------------//
		System.out.println();
		//new연산자를 쓰면, 새로운 주소 새로운 객체를 무조건 힙에 생성.
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {			//주소 비교
			System.out.println("strVar3 과 strVar4는 주소가 같음");
		} else {
			System.out.println("strVar3와 strVar4는 주소가 다름");
		}	//end if-else
		
		
		if(strVar3.equals(strVar4)) {		//값을 비교
			System.out.println("strVar3와 strVar4는 문자열이같음");
		}	//end if
		
		
	}	//end main

}	//end class
