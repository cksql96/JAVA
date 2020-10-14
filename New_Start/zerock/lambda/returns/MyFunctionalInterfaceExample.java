package com.zerock.lambda.returns;

import lombok.extern.log4j.Log4j;


@Log4j
public class MyFunctionalInterfaceExample {
	
	
	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		fi = (x,y) -> {
			int result = x + y;
			
			return result;
		};	//Lambda Expression
		
		
		log.info(fi.method(2, 5)  + "\n");
		//---------------------------------------------------------------------//
		
		fi = (x,y) -> { return x + y; };
		
		log.info(fi.method(2, 5)  + "\n");
		//---------------------------------------------------------------------//
		
		fi = (x,y) -> x + y;
		
		log.info(fi.method(2, 5)  + "\n");
		//---------------------------------------------------------------------//
		
		fi = (x,y) -> MyFunctionalInterfaceExample.sum(x,y);
		
		log.info(fi.method(2, 5));
		
		
	}	//end main
	
	
	public static <T extends Number> int sum (T x, T y) {
		return (x.intValue() + y.intValue());
	}	//sum
	
//	public static <T extends Number> double add (T x, T y) {
//		T sum = null;
//		if(sum instanceof Integer) {
//			return x.intValue() + y.intValue();
//		}else if(sum instanceof Double) {
//			return x.doubleValue() + y.doubleValue();
//		}else {
//			return 1;
//		}
//		
//	}	//add

}	//end class
