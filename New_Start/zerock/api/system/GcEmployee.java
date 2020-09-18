package com.zerock.api.system;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
public class GcEmployee {
	
	public int eno;
	
	@Override
	public void finalize() {
		log.info("Employee(" + eno + ") 이 메모리에서 제거됨");
	}	//finalize 소멸자

}	//end class
