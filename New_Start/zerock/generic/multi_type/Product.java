package com.zerock.generic.multi_type;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@Accessors(fluent=false, chain=true)
@NoArgsConstructor
@Getter
@Setter
public class Product <T,M>{
	
	private T kind;
	private M model;
	
//	public T getKind() {
//		return getKind();
//	}
//	
//	public void setKind(T t) {
//		this.kind = t;
//	}
	
	
}	//end class
