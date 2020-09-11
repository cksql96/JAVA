package com.zerock.interfaceexample;

import lombok.extern.log4j.Log4j;


@Log4j
public class Audio implements RemoteControl{
	//필드
	private int volume;
	
	//turnOn() 추상메소드의 실체 메소드
	@Override
	public void turnOn() {
		log.info("Audio를 켭니다.");
	}	//turnOn
	
	//turnOff() 추상메소드의 실체 메소드
	@Override
	public void turnOff() {
		log.info("Audio를 끕니다.");
	}	//turnOff
	
	//setVolume() 추상메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		log.info("setVolume(volume) invoked.");
		
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}	//if-else-if
		
		log.info("현재 Audio 볼륨 : " + volume);
	}	//setVolume	
	
	@Override
	public void setMute(boolean mute) {
		;;
	}	//setMute

}	//end class
