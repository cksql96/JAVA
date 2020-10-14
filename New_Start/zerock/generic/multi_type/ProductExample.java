package com.zerock.generic.multi_type;

import lombok.extern.log4j.Log4j;


@Log4j
public class ProductExample {
	
	
	public static void main(String[] args) {
		
		Product<Tv, String> product3 = new Product<Tv,String>() {
			
		};	//익명자식객체 코딩 기법
		
		product3.setKind(new Tv());
		//--------------------------------------------------------//
		
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		log.info(tv);
		log.info(tvModel);
		
		//--------------------------------------------------------//
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		log.info(car);
		log.info(carModel);
		
	}	//end main

}	//end class
