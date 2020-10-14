package com.zerock.lambda.functional_interface;

import java.util.function.Consumer;

import lombok.extern.log4j.Log4j;

@Log4j
public class AndThenExample {
	
	
	public static void main(String[] args) {
		//람다식 A
		Consumer<AndThenMember> consumerA = m -> log.info("consumerA: " + m.getName());
		
		//--------------------------------------//
		//람다식 B
		Consumer<AndThenMember> consumerB = m -> log.info("consumerB: " + m.getId());
		
		//--------------------------------------//
		Consumer<AndThenMember> consumerAB = consumerA.andThen(consumerB);
		
		consumerAB.accept(new AndThenMember("홍길동", "hong", null));		
		
		
	}	//end main

}	//end class
