package com.zerock.api.hashcode;

import lombok.extern.log4j.Log4j;

@Log4j
public class TTT {
	
	public static void main(String[] args) {
				
//		String hexString = 
//				Integer.toHexString(134358346);
//		System.out.println(hexString);
		
		Object obj = new Object();
		System.out.println(obj);
		
		int hashCode = obj.hashCode();
		System.out.println(hashCode);
		System.out.println();
		//----------------------------------//
		System.out.println(Integer.toHexString(hashCode));
		
		//getName-> FQCN -> 완전한 위치의 이름
		String typeName = obj.getClass().getName();
		String typeName2 = TTT.class.getClass().getName(); 
		System.out.println(typeName);
		
		String objRef = typeName +"@"+Integer.toHexString(hashCode);
		String objRef2 = typeName2 + "@" + Integer.toHexString(hashCode);
		
		System.out.println(objRef);
		System.out.println();
		//----------------------------------//
		
		log.info(objRef2);
		log.info(objRef);
		log.info(obj);
		
		System.out.println();
		System.out.println();
		System.out.println(new Person());
		Person p = new Person();
		System.out.println(p);
		
		System.out.println(new Person());
		Person p2 = new Person();
		System.out.println(p2);
		System.out.println(new Person());
		System.out.println(new Person());
		System.out.println(new Person());
		
		
	}	//end main
	
}	//end class
