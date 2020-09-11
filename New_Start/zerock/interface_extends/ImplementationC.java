package com.zerock.interface_extends;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class ImplementationC 
	implements InterfaceC {
	
	@Override
	public void methodA() {
		log.info("ImplementationC-methodA() 실행");
	}	//methodA
	
	@Override
	public void methodB() {
		log.info("ImplementationC-methodB() 실행");
	}	//methodB
	
	@Override
	public void methodC() {
		log.info("ImplementationC-methodC() 실행");
	}	//methodC

}	//end class
