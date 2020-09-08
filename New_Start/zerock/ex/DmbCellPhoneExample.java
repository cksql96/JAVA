package com.zerock.ex;

import lombok.extern.log4j.Log4j;


@Log4j
public class DmbCellPhoneExample {
	
	
	public static void main(String[] args) {
		//1. DmbCellphone 자식객체생성
		DmbCellphone dmb = new DmbCellphone("자바폰", "검정", 10);
		
		//2. 부모객체 Cellphone으로부터 상속받은 필드
		log.info("모델 : " + dmb.model);
		log.info("색상 : " + dmb.color);
		
		//3. 자식객체의 dmbCellphone으 ㅣ필드 참조
		log.info("채널: " + dmb.channel);
		
		//4. 부모객체인 Cellphone으로부터 상속받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕.난홍길동");
		dmb.sendVoice("안녕");
		dmb.hangup();
		
		//5. 자식객체인 DmbCellphone의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
		
	}	//end main

}	//end class
