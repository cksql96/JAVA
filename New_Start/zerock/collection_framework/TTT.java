package com.zerock.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;


public class TTT {
	
	//EXTENDS COLLECTION - LIST, SET
	
	//******************************		//	-> 순서를 유지하고 저장
	List<?> l;					// *		//	-> 중복 저장 가능
	//******************************
	
	//일반적인 리스트 활용이다.
	ArrayList<?> al;	
	
	//Synchronized가 걸려있어서 멀티스레드를 구동할때, 세이프하게 돌린다. 대신 스레드가 많으면, 그만큼 시간걸린다.
	Vector<?> v;
	
	//수정할때, 추가, 제거할때 제일 빠르다.
	LinkedList<?> ll;	
	//---------------------------------------//
	
	//******************************		//	-> 순서를 유지하지 않고 저장
	Set<?> s;					// *		//	-> 중복 저장 안됨
	//******************************
	
	//ArrayList와 같은 역할 + 객체의 주소가 중복된 값은 못들어감.
	HashSet<?> hs;
	
	//tree 형식으로, 자동으로 sort가 된다.
	TreeSet<?> ts;
	//-------------------------------------------------------------------//	
	//-------------------------------------------------------------------//
	
	
	//******************************		//	->키와 값의 쌍으로 저장(Key and Value)
	Map<?, ?> m;				// *		//	->키는 중복 저장 안됨
	//******************************
	
	//ArrayList와 같은 역할 + HashSet과 비슷, 하지만 key Value역할
	HashMap<?, ?> hm;
	
	//Vector와 같은 역할
	Hashtable<?, ?> ht;
	
	//TreeSet과 같은데, Key와 Value값이 있다.
	TreeMap<?, ?> tm;
	
	//Key와 Value의 값이 String으로 고정이 되어있다.
	Properties p;

}	//end class
