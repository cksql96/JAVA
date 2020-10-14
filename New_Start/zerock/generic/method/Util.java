package com.zerock.generic.method;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Util {
	
	//Generic Method - return type or parameter type이 
	//타입 파라미터인경우
	public static <A> Box<A> boxing(A a) {
		//static Box boxing(box a) 라는 뜻,
		
		Box<A> box = new Box<A>();
		//Box box = new Box();
		
		box.setBx(a);
		
		return box;
	}	//boxing

}	//end class
