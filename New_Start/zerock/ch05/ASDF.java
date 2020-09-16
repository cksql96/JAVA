package ch05;


public class ASDF {
	
	//Auto-Boxing /Unboxing with Wrapper(Boxed) types
	public static void main(String[] args) {
		
//		Integer i = new Integer(100);		//new로 주면 객체를 생성해야된다. 그러나 아래처럼 쓰면 객체 생성안해도 만들 수 있다.
		Integer i = 100;		//Auto-Boxing		int로 주지않고, Integer라는 클래스를 쓰면,
								//					i는 boxed type으로 들어간다.
		
		int j = i;				//boxed type인 i를 UnBoxing하여, j에 넣는다.
		
		System.out.println(i);
		System.out.println(j);
		
		
	}	//end main

}	//end class
