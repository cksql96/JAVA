package com.zerock.generic.method;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Getter
@Setter
@Accessors(fluent=false, chain=false)
public class Pair<K,V> {
	
	private K key;
	private V value;
	
	
//	public Pair(K key, V value) {
//		this.key = key;
//		this.value = value;
//	}	//constructor
	
	
//	public void setKey(K key) {
//		this.key = key;
//	}	//setKey
//	public void setValue(V value) {
//		this.value = value;
//	}	//setValue
//	public K getKey() {
//		return key;
//	}	//getKey
//	public V getValue() {
//		return value;
//	}	//getValue

}	//end class
