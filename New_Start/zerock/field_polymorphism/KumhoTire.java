package com.zerock.field_polymorphism;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class KumhoTire implements Tire{
	
	@Override
	public void roll() {
		log.info("금호 타이어가 굴러감");
	}	//roll

}	//end class
