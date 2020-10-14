package com.zerock.lambda.field;

import lombok.extern.log4j.Log4j;


@Log4j
public class UsingThis {
	
	public int outterField = 10;		//인스턴스 필드선언
	
	{
		log.info(">>> this in UsingThis : \t" + this);
	}
	
	//중첩클래스 선언 - 클래스 안에 클래스 선언
	class Inner {
		int innerField = 20;		//인스턴스 필드
		
		void aaa() {				//인스턴스 메소드
			//람다식
			MyFunctionalInterface fi = () -> {
				//대전제1: 람다식 실행블록내에서는, 자기를 둘러싸고있는, 바깥쪽 클래스의
				//		맴버(필드,메소드)를 맘대로 사용 가능.
				//----------------------------------------------
				//대전제2: 람다식 실행 블록 내에서, this를 사용한다면
				//		이때 this는 람다식이 만든 익명구현객체의 참조가 아니라
				//		바로 이 람다식을 포함하고 있는 객체의 참조이다.
				log.info(">>> UsingThis.this: \t" + UsingThis.this + "\n");
				
				log.info(">>> this in Inner: \t\t" + this);				
				log.info(">>> Inner.this: \t\t" + Inner.this + "\n");
				//-------------------------------------------------------------------//
				
				
				log.info("OutterField: " + outterField);
				log.info("OutterField: " + 
						UsingThis.this.outterField + "\n");
				//-------------------------------------------------------------------//
				
				log.info("InnerField: " + innerField);
				log.info("InnerField: " + 
						this.innerField + "\n");
			};	//람다식(타겟타입의 익명구현 객체 생성)
			
			fi.method();
			log.info("aaa method in Inner Class ");
			log.info(">>>fi: \t\t" + fi);
			log.info(">>>UsingThis.this: \t" + UsingThis.this);
			log.info(">>>this: \t\t" + this);
			
		}	// method		
		
		class InInner{
			int inInnerField = 7;
		}	//end inner and inner class
		
	}	//end inner class	

}	//end outer class
