package com.zerock.lambda.functional_interface;

import java.util.function.IntBinaryOperator;

import lombok.extern.log4j.Log4j;


@Log4j
public class OperatorExample {
	
	private static int[] scores = {92, 95, 87};
	
	//-----------------------------------------//
	
	//최대값 반환하는 메소드
	public static int maxOrMin(IntBinaryOperator op) {
		int result = scores[0];
		
		for(int score : scores) {
			result = op.applyAsInt(result, score);
		}	//enhanced for
		
		return result;
	}	//maxOrMin
	
	
	//-------------------------MAIN----------------------//
	
	public static void main(String[] args) {
		
		int max = maxOrMin( (result,score) -> { 
			
			if(result >= score ) {
				return result;
			}else {
				return score;
			}	//if-else			
		} /* 람다식 끝 */ );	//maxOrMin 메소드 끝
		
		
		log.info("최대값: " + max);
		
		//--------------------------------------//
		
		int min = maxOrMin( (a,b) -> {
			
			if(a <= b) {
				return a;
			} else {
				return b;
			}	//if-else			
		}); // 람다식과 maxOrMin 메소드 끝
		
		log.info("최소값: " + min);
		
		
	}	//end main	
	
}	//end class
