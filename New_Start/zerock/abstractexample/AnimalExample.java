package com.zerock.abstractexample;

import lombok.extern.log4j.Log4j;


@Log4j
public class AnimalExample {

	
	public static void animalSound(Animal a) {
		a.sound();
	}	//animalSound
	
	//--------MAIN--------//
	public static void main(String[] args) {
		
		Dog dog = new Dog();	//자식객체 생성
		Cat cat = new Cat();	//자식 객체 생성
		
		dog.sound();
		cat.sound();
		
		log.info("---------------------");
		
		//-------------------------------//
		//변수의 자동 타입 변환
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		log.info("----------------------");
		
		//매개변수의 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
		
	}	//end main

}	//end class
