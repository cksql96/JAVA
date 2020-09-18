package com.zerock.api.system;

import lombok.extern.log4j.Log4j;

@Log4j
public class ExitExample {
	
	
	public static void main(String[] args) {
				
		
		//보안관리자설정
		System.setSecurityManager(new SecurityManager() {
			
			@Override
			public void checkExit(int status) {
				System.out.println();
				log.info("status: " + status);
				
				if(status != 5) {
					log.info("throw절 발생");
					throw new SecurityException();
				}	//if				
			}	//checkExit
		
		});	//익명자식객체 코딩기법
		
		
		//------------------------------//
		
		for(int i = 0; i <10; i++) {
			
			try {
				System.exit(i);			//만약 에러가 발생하면, 이것을 실행 안하고, catch절로 간다.
			}catch(SecurityException e) {
				log.info("오류잡앗다잉 그러므로 System.exit실행 안한다.");
			}	//try - catch
		}	//for		
		
	}	//end main

}	//end class
