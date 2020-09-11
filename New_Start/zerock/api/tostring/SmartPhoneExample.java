package com.zerock.api.tostring;

import lombok.extern.log4j.Log4j;

@Log4j
public class SmartPhoneExample {
	
	
	public static void main(String[] args) {
		SmartPhone myPhone = 
				new SmartPhone(
						"구글",
						"안드로이드");
		
		Object obj = new Object();
		
		String strObj = myPhone.toString();
		String strObj2 = obj.toString();
		
		log.info(strObj);
		System.out.println();
		log.info(myPhone);
		System.out.println();
		log.info(strObj2);
		
	}	//end main
	
}	//end class
