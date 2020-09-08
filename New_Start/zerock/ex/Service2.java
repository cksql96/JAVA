package com.zerock.ex;

//@PrintAnnotation
/*@PrintAnnotation*/ public /* @PrintAnnotation */ class Service2 {
	
	/* @PrintAnnotation */
	String name;
	static /* @PrintAnnotation */ int age = 0;
	
	public @PrintAnnotation void instanceMethod1() {
		/* @PrintAnnotation */ int temp = 0;
	}	//instanceMethod
	
	
//	@PrintAnnotation 
	/* @PrintAnnotation */ public /* @PrintAnnotation */ static 
	/* @PrintAnnotation */ void staticMethod(/* @PrintAnnotation */ int age) {
		Service2.age = age;
	}	//staticMethod
	
//***************************************************************	
//	//return 타입과, 메소드 이름 사이에는 넣을 수 없다.						*
//	public void @PrintAnnotation instanceMethod2() {			*
//		;;														*
//	}	//instanceMethod										*
//***************************************************************
	
	//-----------------------------------------------//
	
//	@PrintAnnotation
	/* @PrintAnnotation */ public /* @PrintAnnotation */ Service2(
			/* @PrintAnnotation */ String name) {
		;;
	}	// default constructor
	
	
	//-----------------------------------------------//
	
	

}	//end class
