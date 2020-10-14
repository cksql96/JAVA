package com.zerock.generic.method;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@Accessors(fluent=false, chain=false)
@Getter
@Setter
@NoArgsConstructor
public class Box<T> {
	
	private T bx;
	
	
//	public T get() {
//		return t;
//	}	//get
//	
//	public void set(T t) {
//		this.t = t;
//	}	//set

}	//end class
