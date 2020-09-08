package com.zerock.ex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target({
	ElementType.METHOD,				//메소드
//	ElementType.CONSTRUCTOR,		//생성자		
//	ElementType.FIELD,				//필드
//	ElementType.LOCAL_VARIABLE,		//지역변수
//	ElementType.PARAMETER,			//매개변수		
//	ElementType.TYPE,				//타입
//	ElementType.ANNOTATION_TYPE,	//어노테이션타입
//	ElementType.PACKAGE,			//패키지. ->생성할때 package info 체크해야댐.
//	ElementType.TYPE_USE,			//메소드와 패키지에만 오류. 타입이 있아야 미오류.		
									//값 마지막에 ','가 있어도 된다. 다만 비추천.
})
/* @PrintAnnotation */
/* @PrintAnnotation */ public /* @PrintAnnotation */ @interface PrintAnnotation {
//	//엘리먼트(또는 속성 )선언
	String value() default "-";		//기본값으로 문자열 "-"지정
	int number() default 15;		//기본값으로 정수 15 지정
	

}	//end annotation
