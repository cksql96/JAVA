package com.zerock.api.objects;

import java.util.Arrays;
import java.util.Objects;

import lombok.extern.log4j.Log4j;

@Log4j
public class EqualsAndDeepEqualsExample {
	
	//equals는 기본타입일시, 값비교, 참조타입일시 주소비교. 
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		log.info(Objects.equals(o1, o2));				//true		//a.equals(b)	//값비교
		
		log.info(Objects.equals(o1, null));			//false
		log.info(Objects.equals(null, o2));			//false
		log.info(Objects.equals(null, null));			//true
		
		log.info(Objects.equals(o1, o2) + "\n");		//true		//둘다 null이 아니면 a.equals(b)
		
		//---------------------------------//
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		
		log.info(Objects.equals(arr1, arr2));			//false		//a.equals(b)	//주소비교
		
		//deepEquals는 두 객체가 널이 아니고, 배열객체인 경우는, 배열의 원소를 비교한다.
		//deepEquals는 
		//not null, not array = a.equals(b)			//주소나 값 비교
		//not null, array = Arrays.deepEquals(a,b)	//배열 안의 값을 비교.
		log.info(Objects.deepEquals(arr1, arr2));		//true
		log.info(Arrays.deepEquals(arr1, arr2));	//true
		
		log.info(Objects.deepEquals(null, arr2));		//false
		log.info(Objects.deepEquals(arr1, null));		//false
		log.info(Objects.deepEquals(null, null));		//true
		
		
	}

}
