package com.zerock.generic;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Box {		//현실의 박스를 구현한것이다.
	
	private Object object;		//박스안에 대부분이 다 들어가므로, Object타입을 주었다.
	
	
	public void set(Object object) {
		this.object = object;
	}	//set
	
	public Object get() {
		return object;
	}	//get

}	//end class
