package com.zerock.ex;

import lombok.extern.log4j.Log4j;


@Log4j
public class DmbCellphone extends Cellphone{
	//--필드
	int channel;
	
	
	//생성자
	DmbCellphone(String model, String color, int channel) {
		//부모생성자에 매개변수가 있으면, super를 사용하여 호출.
		super(model, color);
		//매개변수가 없으면 super를 써도 되고, 안써도 된다.
		
		log.info("ㅁㅁㅁㅁCellphone(model, color, channel) invoked");
		
//		this.model = model;			//부모객체 필드값 할당
//		this.color = color;			//부모객체 필드값 할당
		
		this.channel = channel;		//자식객체 필드 초기화
	}	//constructor
	
	
	//메소드
	void turnOnDmb() {
		log.info("채널 " + channel + "번 DMB 방송 수신을 시작한다.");
	}	// turnOnDmb
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		log.info("채널" + channel + "번으로 바꿉니다.");
	}	//changeChannelDmb
	
	void turnOffDmb() {
		log.info("Dmb를 끕니다.");
	}	//turnOffDmb

}	//end class
